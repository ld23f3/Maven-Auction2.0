package com.etc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.etc.bean.entity.GoodsBean;
import com.etc.dao.GoodsDao;
import com.etc.dao.GoodsImgDao;
import com.etc.entity.Goods;
import com.etc.entity.GoodsImg;
import com.etc.entity.GoodsView;
import com.etc.entity.Users;
import com.etc.service.GoodsService;

/**
 * 自定义前台控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/api")
public class GoodsController {
	/**
	 * 注入参数
	 */
	@Resource(name = "goodsDao")
	private GoodsDao gd;
	@Resource(name = "goodsImgDao")
	private GoodsImgDao gid;
	@Resource(name = "goodsService")
	private GoodsService goodsService;

	/**
	 * 测试时打开添加的网页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String SelectGoods() {
		return "/Reception/AddGoods";

	}

	/**
	 * 添加商品
	 * 
	 * @param req
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/FileUpload")
	public String AddGoods(@RequestParam("file") MultipartFile[] file, HttpServletRequest req, HttpSession session,
			HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html ; charset=UTF-8");

		PrintWriter out = res.getWriter();
		String goods_name = req.getParameter("Gname");// 商品名
		System.out.println(goods_name);
		double goods_minprice = Double.parseDouble(req.getParameter("Gemail"));// 起拍价
		String type = req.getParameter("Gselect");// 类型goods_typeid
		int goods_typeid = 1;
		if (type.equals("字画")) {
			goods_typeid = 1;
		} else if (type.equals("陶瓷")) {
			goods_typeid = 2;
		} else if (type.equals("玉石")) {
			goods_typeid = 3;
		} else if (type.equals("杂项")) {
			goods_typeid = 4;
		}
		double goods_minpremium = Double.parseDouble(req.getParameter("Gnumber"));// 最低加价
		double goods_margin = Double.parseDouble(req.getParameter("Greal"));// 商品竞拍保证金Greal ->goods_margin
		int goods_auctiontime = Integer.parseInt(req.getParameter("Gday"));// 拍卖天数Gday ->goods_auctiontime
		String goods_desc = req.getParameter("Gress");// 商品描述Gress ->goods_desc
		// 得到登陆的时候传递的session的值

		Goods g = new Goods();
		g.setGoods_name(goods_name);
		g.setGoods_minprice(goods_minprice);
		g.setGoods_typeid(goods_typeid);
		g.setGoods_desc(goods_desc);
		g.setGood_state(0);
		g.setUser_id(2);
		g.setGoods_minpremium(goods_minpremium);
		g.setGoods_auctiontime(goods_auctiontime);

		// 添加商品到商品表
		int a = gd.InsertGoods(g);

		List<Goods> list1 = gd.queryGoods(goods_name);
		Goods g1 = list1.get(0);
		int goods_id = g1.getGoods_id();
		// 上传图片
		List<String> list = new ArrayList<String>();
		if (file != null && file.length > 0) {
			for (int i = 0; i < file.length; i++) {
				MultipartFile fil = file[i];
				// 保存文件
				list = saveFile(req, fil, list, goods_id);

			}
		}

		out.print("<scipt>alert('添加成功');</script>");
		return "redirect:/list";

	}

	/**
	 * 自定义上传图片到指定路径
	 * 
	 * @param request
	 * @param file
	 * @param list
	 * @param goods_id
	 * @return
	 */
	private List<String> saveFile(HttpServletRequest request, MultipartFile file, List<String> list, int goods_id) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				// 保存的文件路径(如果用的是Tomcat服务器，文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
				// )
				String filePath = request.getSession().getServletContext().getRealPath("/") + "images/"
						+ file.getOriginalFilename();
				GoodsImg gi = new GoodsImg();
				gi.setGoodsimg_src(filePath);
				gi.setGoods_id(goods_id);
				gid.AddGoodsImg(gi);
				list.add(file.getOriginalFilename());
				File saveDir = new File(filePath);
				if (!saveDir.getParentFile().exists())
					saveDir.getParentFile().mkdirs();

				// 转存文件
				file.transferTo(saveDir);
				return list;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 查詢所有商品
	 * 
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/query")
	public String queryAll(Model m, HttpSession session) {
		List<GoodsView> list = gd.queryAllGoods();
		m.addAttribute("list", list);
		session.setAttribute("list", list);
		System.out.println(list);
		return "/Reception/ShowGoods";
	}
	
	/**
	 * 根据用户id查询商品
	 * @param model
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value="goods", method = RequestMethod.GET)
	public String queryGoodsByUserId(Model model ,HttpSession httpSession) {
		
		Users users = (Users)httpSession.getAttribute("user");
		System.out.println("users"+users);
		int user_id = users.getUser_id();
		System.out.println("user_id"+user_id);
		List<GoodsBean> mygoods = goodsService.queryGoodsByUserId(user_id);
		
		model.addAttribute("mygoods", mygoods);
		
		mygoods.forEach(System.out::println);
		
		return "Reception/mygoods";
		
	}
	/**
	 * 根据商品id查询商品详情
	 * @param goodsId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="goodsInfo/{goods_id}", method = RequestMethod.GET)
	public String queryGoodsByGoodsId(@PathVariable(value="goods_id") int goodsId ,Model model) {
		
		
		System.out.println("goodsInfo:\n" + goodsId);
		
		List<GoodsBean> goodsInfo = goodsService.queryGoodsByGoodsId(goodsId);
		
		model.addAttribute("goodsInfo", goodsInfo);

		goodsInfo.forEach(System.out::println);
		return "Reception/goodsInfo";
	}

}
