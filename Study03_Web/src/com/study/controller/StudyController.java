package com.study.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.biz.StudyBiz;
import com.study.biz.StudyBizImpl;
import com.study.dto.StudyDto;

@WebServlet("/StudyController")
public class StudyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String command = request.getParameter("command");
		System.out.println(command);
		
		StudyBiz biz = new StudyBizImpl();
		
		if(command.equals("list")) {
			List<StudyDto> list = biz.selectList();
			request.setAttribute("list", list);
			
			RequestDispatcher dis = request.getRequestDispatcher("studylist.jsp");
			dis.forward(request, response);
			
		}else if(command.equals("one")) {
			int no = Integer.parseInt(request.getParameter("no"));
			StudyDto dto = biz.selectOne(no);
			System.out.println(dto.getName());
			request.setAttribute("dto", dto);

			RequestDispatcher dis = request.getRequestDispatcher("selectone.jsp");
			dis.forward(request, response);
			
		}else if(command.equals("insertform")) {
			response.sendRedirect("insertform.jsp");
			
		}else if(command.equals("insertres")) {
			String name = request.getParameter("name");
			String loc = request.getParameter("loc");
			StudyDto dto = new StudyDto();
			dto.setName(name);
			dto.setLoc(loc);
			
			int res = biz.insert(dto);
			if(res > 0) {
				response.sendRedirect("con.do?command=list");
			}else {
				response.sendRedirect("con.do?command=insertform");
			}
			
		}else if(command.equals("updateform")) {
			int no = Integer.parseInt(request.getParameter("no"));
			StudyDto dto = biz.selectOne(no);
			request.setAttribute("dto", dto);

			RequestDispatcher dis = request.getRequestDispatcher("updateform.jsp");
			dis.forward(request, response);
			
		}else if(command.equals("updateres")) {
			int no = Integer.parseInt(request.getParameter("no"));
			String name = request.getParameter("name");
			String loc = request.getParameter("loc");
			StudyDto dto = new StudyDto();
			dto.setNo(no);
			dto.setName(name);
			dto.setLoc(loc);
			
			int res = biz.update(dto);
			if(res > 0) {
				response.sendRedirect("con.do?command=list");
			}else {
				request.setAttribute("dto", dto);
				RequestDispatcher dis = request.getRequestDispatcher("updateform.jsp");
				dis.forward(request, response);
			}
			
		}else if(command.equals("delete")) {
			int no = Integer.parseInt(request.getParameter("no"));
			int res = biz.delete(no);
			
			if(res > 0) {
				response.sendRedirect("con.do?command=list");
			}else {
				request.setAttribute("no", no);
				RequestDispatcher dis = request.getRequestDispatcher("con.do?command=one");
				dis.forward(request, response);
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
