package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.jjdev.mall.dao.MemberDao;
import cafe.jjdev.mall.service.Member;

@WebServlet("/GetServlet")
public class GetMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberDao memberDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("loginMember") == null) {
			// redirect
		} else {
//			Member member = memberDao.selectMember("");
//			request.getAttribute("model", model);
		}
	}

}
