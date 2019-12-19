package org.java.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dao.Biaobai3Dao;
import org.java.dao.impl.DaoFactory;
import org.java.helper.ImgUtil;
import org.java.helper.StringUtil;
import org.java.pojo.Biaobai3;
import org.java.pojo.User;

@WebServlet("/Biaobai3Add")
public class Biaobai3Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ֹ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		User user=null;
		user=(User) request.getSession().getAttribute("loginUser");
		if(user==null)
		{
			request.setAttribute("error", "�����ȵ�¼֮���ټ���������");
			request.getRequestDispatcher("/onload.jsp").forward(request, response);
			return;
		}
		String roommateName=request.getParameter("roommateName");
		String gender=request.getParameter("gender");
		String department=request.getParameter("department");
		String grade=request.getParameter("grade");
		String contact=request.getParameter("contact");
		String content=request.getParameter("content");
		List list = ImgUtil.getImageSrc(content);
		String picturePath = StringUtil.listToString(list, ',');
		String withouthtml=request.getParameter("contentwithouthtml");
		//��ȡ���ֱ��������ΪժҪ
		String contentwithouthtml=withouthtml.length()<50?withouthtml:withouthtml.substring(0, 50);
		//SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Biaobai3Dao biaobai3Dao=null;
		Biaobai3 biaobai3=null;
		if(roommateName!=null&&!"".equals(roommateName.trim())&&content!=null&&!"".equals(content.trim())){
			//���������������и�ֵ
			biaobai3=new Biaobai3();
			if(list.size()>0)
				biaobai3.setImgUrl(picturePath);
			biaobai3.setUsername(user.getUsername());
			biaobai3.setRoommateName(roommateName);
			biaobai3.setGender(gender);
			biaobai3.setDepartment(department);
			biaobai3.setGrade(grade);
			biaobai3.setContact(contact);
			biaobai3.setContent(content);
			biaobai3.setContentwithouthtml(contentwithouthtml);
			biaobai3.setIssuedate(new Timestamp(System.currentTimeMillis()));
		}
		if(biaobai3!=null){
			//���������������벢����ת����ҳ
			biaobai3Dao=DaoFactory.getBiaobai3Dao();
			biaobai3Dao.addBiaobai3(biaobai3);
			request.setAttribute("success", "��׳ɹ�");
			request.getRequestDispatcher("/onload2.jsp").forward(request, response);
			return;
		}else{
			//���������������ת������ҳ��
			response.sendRedirect(request.getContextPath()+"/errorPage.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
