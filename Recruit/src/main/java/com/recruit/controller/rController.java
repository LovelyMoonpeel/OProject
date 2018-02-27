package com.recruit.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.zerock.domain.BoardVO;
import com.recruit.domain.CinfoVO;
//import org.zerock.service.BoardService;

@Controller
@RequestMapping("/rpjt/*")
public class rController {

	private static final Logger logger = LoggerFactory.getLogger(rController.class);

	@Inject
//	private BoardService service;
	
	public CinfoVO makeCinfo(){
		CinfoVO cinfo = new CinfoVO();
		cinfo.setId("id"); // String id;
		cinfo.setCname("���������"); // String cname;
		cinfo.setImg(1); // int img;
		cinfo.setHomepage("http://www.dkpharm.co.kr"); // String homepage;
		cinfo.setIntro("1968�� 10�� 15�Ͽ� ������ ���� �Ǿ�ǰ ������ ������ �Ǿ�ǰ(�λ絹,���ո���ī��,����޵�,�����ֻ�),�ֻ���(Prefilled syringe system) ����,����,���� ����� �ϴ� �ڽ��ڱ���̸�, �ں����� 222�� 3,000���� ������� 3,044�� 815���� ������� 813���Դϴ�."); // String intro;
		cinfo.setCeo("������"); // String ceo;
		cinfo.setCtype("���� �Ǿ�ǰ ������"); // String ctype;
		cinfo.setForm("�ڽ���, 1000����, �߰߱��, �ܺΰ������, ������ ���, ���λ��ü"); // String form;
		cinfo.setEstablish("1968�� 10�� 15��"); // String establish;
		cinfo.setNumemp("813"); // String numemp;
		cinfo.setSales("3,044�� 815����"); // String sales;
		cinfo.setTel("02-2191-9800"); // String tel;
		cinfo.setFax("02-566-8542"); // String fax;
		cinfo.setSns("https://www.instagram.com/exia0710/"); // private String sns;
		cinfo.setLocation("���� ������ ��ġ3�� 997-8 ��������"); // String location;
		return cinfo;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexGET(CinfoVO cinfo, Model model) throws Exception {
		cinfo = makeCinfo();
		System.out.print(cinfo);
		model.addAttribute(cinfo);
		return "rpjt/C_index";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyGET(CinfoVO cinfo, Model model) throws Exception {
		cinfo = makeCinfo();
		model.addAttribute(cinfo);
		return "rpjt/C_modify";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writeGET(CinfoVO cinfo, Model model) throws Exception {
		cinfo = makeCinfo();
		model.addAttribute(cinfo);
		return "rpjt/C_write";
	}

	@RequestMapping(value = "/manage", method = RequestMethod.GET)
	public String manageGET(CinfoVO cinfo, Model model) throws Exception {
		return "rpjt/C_manage";
	}

	@RequestMapping(value = "/recom", method = RequestMethod.GET)
	public String recomGET(CinfoVO cinfo, Model model) throws Exception {
		return "rpjt/C_recom";
	}

	@RequestMapping(value = "/favor", method = RequestMethod.GET)
	public String favorGET(CinfoVO cinfo, Model model) throws Exception {
		return "rpjt/C_favor";
	}
}
