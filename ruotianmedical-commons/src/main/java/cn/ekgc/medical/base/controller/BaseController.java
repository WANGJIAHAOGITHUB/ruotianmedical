package cn.ekgc.medical.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>系统基础信息 - 系统控制层基础类</b>
 * <P>
 *     系统所有的控制层类<br/>
 *     <b>都必须继承于本类作为基础类</b>
 * </P>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
