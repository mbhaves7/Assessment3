/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-18 11:14:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_002dregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1713433522482L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("<title>Home Version One || limupa - Digital Products Store\r\n");
      out.write("	eCommerce Bootstrap 4 Template</title>\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/favicon.png\">\r\n");
      out.write("<!-- Material Design Iconic Font-V2.2.0 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<!-- Font Awesome Stars-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/fontawesome-stars.css\">\r\n");
      out.write("<!-- Meanmenu CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/meanmenu.css\">\r\n");
      out.write("<!-- owl carousel CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<!-- Slick Carousel CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/slick.css\">\r\n");
      out.write("<!-- Animate CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<!-- Jquery-ui CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\">\r\n");
      out.write("<!-- Venobox CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/venobox.css\">\r\n");
      out.write("<!-- Nice Select CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/nice-select.css\">\r\n");
      out.write("<!-- Magnific Popup CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("<!-- Bootstrap V4.1.3 Fremwork CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- Helper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/helper.css\">\r\n");
      out.write("<!-- Main Style CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<!-- Responsive CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("<!-- Modernizr js -->\r\n");
      out.write("<script src=\"js/vendor/modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<!-- Begin Header Top Area -->\r\n");
      out.write("		<div class=\"header-top\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<!-- Begin Header Top Left Area -->\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4\">\r\n");
      out.write("						<div class=\"header-top-left\">\r\n");
      out.write("							<ul class=\"phone-wrap\">\r\n");
      out.write("								<li><span>Telephone Enquiry:</span><a href=\"#\">(+123)\r\n");
      out.write("										123 321 345</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- Header Top Left Area End Here -->\r\n");
      out.write("					<!-- Begin Header Top Right Area -->\r\n");
      out.write("					<div class=\"col-lg-9 col-md-8\">\r\n");
      out.write("						<div class=\"header-top-right\">\r\n");
      out.write("							<ul class=\"ht-menu\">\r\n");
      out.write("								<!-- Begin Setting Area -->\r\n");
      out.write("								<li>\r\n");
      out.write("									<div class=\"ht-setting-trigger\">\r\n");
      out.write("										<span>Setting</span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"setting ht-setting\">\r\n");
      out.write("										<ul class=\"ht-setting-list\">\r\n");
      out.write("											<li><a href=\"customer-login.jsp\">My Account</a></li>\r\n");
      out.write("											<li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("											<li><a href=\"login-register.html\">Sign In</a></li>\r\n");
      out.write("										</ul>\r\n");
      out.write("									</div>\r\n");
      out.write("								</li>\r\n");
      out.write("								<!-- Setting Area End Here -->\r\n");
      out.write("								<!-- Begin Currency Area -->\r\n");
      out.write("								<li><span class=\"currency-selector-wrapper\">Currency\r\n");
      out.write("										:</span>\r\n");
      out.write("									<div class=\"ht-currency-trigger\">\r\n");
      out.write("										<span>USD $</span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"currency ht-currency\">\r\n");
      out.write("										<ul class=\"ht-setting-list\">\r\n");
      out.write("											<li><a href=\"#\">EUR €</a></li>\r\n");
      out.write("											<li class=\"active\"><a href=\"#\">USD $</a></li>\r\n");
      out.write("										</ul>\r\n");
      out.write("									</div></li>\r\n");
      out.write("								<!-- Currency Area End Here -->\r\n");
      out.write("								<!-- Begin Language Area -->\r\n");
      out.write("								<li><span class=\"language-selector-wrapper\">Language\r\n");
      out.write("										:</span>\r\n");
      out.write("									<div class=\"ht-language-trigger\">\r\n");
      out.write("										<span>English</span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"language ht-language\">\r\n");
      out.write("										<ul class=\"ht-setting-list\">\r\n");
      out.write("											<li class=\"active\"><a href=\"#\"><img\r\n");
      out.write("													src=\"images/menu/flag-icon/1.jpg\" alt=\"\">English</a></li>\r\n");
      out.write("											<li><a href=\"#\"><img\r\n");
      out.write("													src=\"images/menu/flag-icon/2.jpg\" alt=\"\">Français</a></li>\r\n");
      out.write("										</ul>\r\n");
      out.write("									</div></li>\r\n");
      out.write("								<!-- Language Area End Here -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- Header Top Right Area End Here -->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Header Top Area End Here -->\r\n");
      out.write("		<!-- Begin Header Middle Area -->\r\n");
      out.write("		<div class=\"header-middle pl-sm-0 pr-sm-0 pl-xs-0 pr-xs-0\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<!-- Begin Header Logo Area -->\r\n");
      out.write("					<div class=\"col-lg-3\">\r\n");
      out.write("						<div class=\"logo pb-sm-30 pb-xs-30\">\r\n");
      out.write("							<a href=\"index.html\"> <img src=\"images/menu/logo/1.jpg\"\r\n");
      out.write("								alt=\"\">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- Header Logo Area End Here -->\r\n");
      out.write("					<!-- Begin Header Middle Right Area -->\r\n");
      out.write("					<div class=\"col-lg-9 pl-0 ml-sm-15 ml-xs-15\">\r\n");
      out.write("						<!-- Begin Header Middle Searchbox Area -->\r\n");
      out.write("						<form action=\"#\" class=\"hm-searchbox\">\r\n");
      out.write("							<select class=\"nice-select select-search-category\">\r\n");
      out.write("								<option value=\"0\">All</option>\r\n");
      out.write("								<option value=\"10\">Laptops</option>\r\n");
      out.write("								<option value=\"17\">- - Prime Video</option>\r\n");
      out.write("								<option value=\"20\">- - - - All Videos</option>\r\n");
      out.write("								<option value=\"21\">- - - - Blouses</option>\r\n");
      out.write("								<option value=\"22\">- - - - Evening Dresses</option>\r\n");
      out.write("								<option value=\"23\">- - - - Summer Dresses</option>\r\n");
      out.write("								<option value=\"24\">- - - - T-shirts</option>\r\n");
      out.write("								<option value=\"25\">- - - - Rent or Buy</option>\r\n");
      out.write("								<option value=\"26\">- - - - Your Watchlist</option>\r\n");
      out.write("								<option value=\"27\">- - - - Watch Anywhere</option>\r\n");
      out.write("								<option value=\"28\">- - - - Getting Started</option>\r\n");
      out.write("								<option value=\"18\">- - - - Computers</option>\r\n");
      out.write("								<option value=\"29\">- - - - More to Explore</option>\r\n");
      out.write("								<option value=\"30\">- - - - TV &amp; Video</option>\r\n");
      out.write("								<option value=\"31\">- - - - Audio &amp; Theater</option>\r\n");
      out.write("								<option value=\"32\">- - - - Camera, Photo</option>\r\n");
      out.write("								<option value=\"33\">- - - - Cell Phones</option>\r\n");
      out.write("								<option value=\"34\">- - - - Headphones</option>\r\n");
      out.write("								<option value=\"35\">- - - - Video Games</option>\r\n");
      out.write("								<option value=\"36\">- - - - Wireless Speakers</option>\r\n");
      out.write("								<option value=\"19\">- - - - Electronics</option>\r\n");
      out.write("								<option value=\"37\">- - - - Amazon Home</option>\r\n");
      out.write("								<option value=\"38\">- - - - Kitchen &amp; Dining</option>\r\n");
      out.write("								<option value=\"39\">- - - - Furniture</option>\r\n");
      out.write("								<option value=\"40\">- - - - Bed &amp; Bath</option>\r\n");
      out.write("								<option value=\"41\">- - - - Appliances</option>\r\n");
      out.write("								<option value=\"11\">TV &amp; Audio</option>\r\n");
      out.write("								<option value=\"42\">- - Chamcham</option>\r\n");
      out.write("								<option value=\"45\">- - - - Office</option>\r\n");
      out.write("								<option value=\"47\">- - - - Gaming</option>\r\n");
      out.write("								<option value=\"48\">- - - - Chromebook</option>\r\n");
      out.write("								<option value=\"49\">- - - - Refurbished</option>\r\n");
      out.write("								<option value=\"50\">- - - - Touchscreen</option>\r\n");
      out.write("								<option value=\"51\">- - - - Ultrabooks</option>\r\n");
      out.write("								<option value=\"52\">- - - - Blouses</option>\r\n");
      out.write("								<option value=\"43\">- - Sanai</option>\r\n");
      out.write("								<option value=\"53\">- - - - Hard Drives</option>\r\n");
      out.write("								<option value=\"54\">- - - - Graphic Cards</option>\r\n");
      out.write("								<option value=\"55\">- - - - Processors (CPU)</option>\r\n");
      out.write("								<option value=\"56\">- - - - Memory</option>\r\n");
      out.write("								<option value=\"57\">- - - - Motherboards</option>\r\n");
      out.write("								<option value=\"58\">- - - - Fans &amp; Cooling</option>\r\n");
      out.write("								<option value=\"59\">- - - - CD/DVD Drives</option>\r\n");
      out.write("								<option value=\"44\">- - Meito</option>\r\n");
      out.write("								<option value=\"60\">- - - - Sound Cards</option>\r\n");
      out.write("								<option value=\"61\">- - - - Cases &amp; Towers</option>\r\n");
      out.write("								<option value=\"62\">- - - - Casual Dresses</option>\r\n");
      out.write("								<option value=\"63\">- - - - Evening Dresses</option>\r\n");
      out.write("								<option value=\"64\">- - - - T-shirts</option>\r\n");
      out.write("								<option value=\"65\">- - - - Tops</option>\r\n");
      out.write("								<option value=\"12\">Smartphone</option>\r\n");
      out.write("								<option value=\"66\">- - Camera Accessories</option>\r\n");
      out.write("								<option value=\"68\">- - - - Octa Core</option>\r\n");
      out.write("								<option value=\"69\">- - - - Quad Core</option>\r\n");
      out.write("								<option value=\"70\">- - - - Dual Core</option>\r\n");
      out.write("								<option value=\"71\">- - - - 7.0 Screen</option>\r\n");
      out.write("								<option value=\"72\">- - - - 9.0 Screen</option>\r\n");
      out.write("								<option value=\"73\">- - - - Bags &amp; Cases</option>\r\n");
      out.write("								<option value=\"67\">- - XailStation</option>\r\n");
      out.write("								<option value=\"74\">- - - - Batteries</option>\r\n");
      out.write("								<option value=\"75\">- - - - Microphones</option>\r\n");
      out.write("								<option value=\"76\">- - - - Stabilizers</option>\r\n");
      out.write("								<option value=\"77\">- - - - Video Tapes</option>\r\n");
      out.write("								<option value=\"78\">- - - - Memory Card Readers</option>\r\n");
      out.write("								<option value=\"79\">- - - - Tripods</option>\r\n");
      out.write("								<option value=\"13\">Cameras</option>\r\n");
      out.write("								<option value=\"14\">headphone</option>\r\n");
      out.write("								<option value=\"15\">Smartwatch</option>\r\n");
      out.write("								<option value=\"16\">Accessories</option>\r\n");
      out.write("							</select> <input type=\"text\" placeholder=\"Enter your search key ...\">\r\n");
      out.write("							<button class=\"li-btn\" type=\"submit\">\r\n");
      out.write("								<i class=\"fa fa-search\"></i>\r\n");
      out.write("							</button>\r\n");
      out.write("						</form>\r\n");
      out.write("						<!-- Header Middle Searchbox Area End Here -->\r\n");
      out.write("						<!-- Begin Header Middle Right Area -->\r\n");
      out.write("						<div class=\"header-middle-right\">\r\n");
      out.write("							<ul class=\"hm-menu\">\r\n");
      out.write("								<!-- Begin Header Middle Wishlist Area -->\r\n");
      out.write("								<li class=\"hm-wishlist\"><a href=\"wishlist.html\"> <span\r\n");
      out.write("										class=\"cart-item-count wishlist-item-count\">0</span> <i\r\n");
      out.write("										class=\"fa fa-heart-o\"></i> <!-- content: \"\\f08a\"; -->\r\n");
      out.write("								</a></li>\r\n");
      out.write("								<!-- Header Middle Wishlist Area End Here -->\r\n");
      out.write("								<!-- Begin Header Mini Cart Area -->\r\n");
      out.write("								<li class=\"hm-minicart\">\r\n");
      out.write("									<div class=\"hm-minicart-trigger\">\r\n");
      out.write("										<span class=\"item-icon\"></span> <span class=\"item-text\">£80.00\r\n");
      out.write("											<span class=\"cart-item-count\">2</span>\r\n");
      out.write("										</span>\r\n");
      out.write("									</div> <span></span>\r\n");
      out.write("									<div class=\"minicart\">\r\n");
      out.write("										<ul class=\"minicart-product-list\">\r\n");
      out.write("											<li><a href=\"single-product.html\"\r\n");
      out.write("												class=\"minicart-product-image\"> <img\r\n");
      out.write("													src=\"images/product/small-size/5.jpg\" alt=\"cart products\">\r\n");
      out.write("											</a>\r\n");
      out.write("												<div class=\"minicart-product-details\">\r\n");
      out.write("													<h6>\r\n");
      out.write("														<a href=\"single-product.html\">Aenean eu tristique</a>\r\n");
      out.write("													</h6>\r\n");
      out.write("													<span>£40 x 1</span>\r\n");
      out.write("												</div>\r\n");
      out.write("												<button class=\"close\" title=\"Remove\">\r\n");
      out.write("													<i class=\"fa fa-close\"></i>\r\n");
      out.write("												</button></li>\r\n");
      out.write("											<li><a href=\"single-product.html\"\r\n");
      out.write("												class=\"minicart-product-image\"> <img\r\n");
      out.write("													src=\"images/product/small-size/6.jpg\" alt=\"cart products\">\r\n");
      out.write("											</a>\r\n");
      out.write("												<div class=\"minicart-product-details\">\r\n");
      out.write("													<h6>\r\n");
      out.write("														<a href=\"single-product.html\">Aenean eu tristique</a>\r\n");
      out.write("													</h6>\r\n");
      out.write("													<span>£40 x 1</span>\r\n");
      out.write("												</div>\r\n");
      out.write("												<button class=\"close\" title=\"Remove\">\r\n");
      out.write("													<i class=\"fa fa-close\"></i>\r\n");
      out.write("												</button></li>\r\n");
      out.write("										</ul>\r\n");
      out.write("										<p class=\"minicart-total\">\r\n");
      out.write("											SUBTOTAL: <span>£80.00</span>\r\n");
      out.write("										</p>\r\n");
      out.write("										<div class=\"minicart-button\">\r\n");
      out.write("											<a href=\"shopping-cart.html\"\r\n");
      out.write("												class=\"li-button li-button-fullwidth li-button-dark\"> <span>View\r\n");
      out.write("													Full Cart</span>\r\n");
      out.write("											</a> <a href=\"checkout.html\"\r\n");
      out.write("												class=\"li-button li-button-fullwidth\"> <span>Checkout</span>\r\n");
      out.write("											</a>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</li>\r\n");
      out.write("								<!-- Header Mini Cart Area End Here -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- Header Middle Right Area End Here -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"header-bottom header-sticky d-none d-lg-block d-xl-block\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-lg-12\">\r\n");
      out.write("						<div class=\"hb-menu\">\r\n");
      out.write("							<nav>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"dropdown-holder\"><a href=\"index.html\">Home</a>\r\n");
      out.write("										<ul class=\"hb-dropdown\">\r\n");
      out.write("											<li class=\"active\"><a href=\"index.html\">Home One</a></li>\r\n");
      out.write("											<li><a href=\"index-2.html\">Home Two</a></li>\r\n");
      out.write("											<li><a href=\"index-3.html\">Home Three</a></li>\r\n");
      out.write("											<li><a href=\"index-4.html\">Home Four</a></li>\r\n");
      out.write("										</ul></li>\r\n");
      out.write("									<li class=\"megamenu-holder\"><a\r\n");
      out.write("										href=\"shop-left-sidebar.html\">Shop</a>\r\n");
      out.write("										<ul class=\"megamenu hb-megamenu\">\r\n");
      out.write("											<li><a href=\"shop-left-sidebar.html\">Shop Page\r\n");
      out.write("													Layout</a>\r\n");
      out.write("												<ul>\r\n");
      out.write("													<li><a href=\"shop-3-column.html\">Shop 3 Column</a></li>\r\n");
      out.write("													<li><a href=\"shop-4-column.html\">Shop 4 Column</a></li>\r\n");
      out.write("													<li><a href=\"shop-left-sidebar.html\">Shop Left\r\n");
      out.write("															Sidebar</a></li>\r\n");
      out.write("													<li><a href=\"shop-right-sidebar.html\">Shop Right\r\n");
      out.write("															Sidebar</a></li>\r\n");
      out.write("													<li><a href=\"shop-list.html\">Shop List</a></li>\r\n");
      out.write("													<li><a href=\"shop-list-left-sidebar.html\">Shop\r\n");
      out.write("															List Left Sidebar</a></li>\r\n");
      out.write("													<li><a href=\"shop-list-right-sidebar.html\">Shop\r\n");
      out.write("															List Right Sidebar</a></li>\r\n");
      out.write("												</ul></li>\r\n");
      out.write("											<li><a href=\"single-product-gallery-left.html\">Single\r\n");
      out.write("													Product Style</a>\r\n");
      out.write("												<ul>\r\n");
      out.write("													<li><a href=\"single-product-carousel.html\">Single\r\n");
      out.write("															Product Carousel</a></li>\r\n");
      out.write("													<li><a href=\"single-product-gallery-left.html\">Single\r\n");
      out.write("															Product Gallery Left</a></li>\r\n");
      out.write("													<li><a href=\"single-product-gallery-right.html\">Single\r\n");
      out.write("															Product Gallery Right</a></li>\r\n");
      out.write("													<li><a href=\"single-product-tab-style-top.html\">Single\r\n");
      out.write("															Product Tab Style Top</a></li>\r\n");
      out.write("													<li><a href=\"single-product-tab-style-left.html\">Single\r\n");
      out.write("															Product Tab Style Left</a></li>\r\n");
      out.write("													<li><a href=\"single-product-tab-style-right.html\">Single\r\n");
      out.write("															Product Tab Style Right</a></li>\r\n");
      out.write("												</ul></li>\r\n");
      out.write("											<li><a href=\"single-product.html\">Single Products</a>\r\n");
      out.write("												<ul>\r\n");
      out.write("													<li><a href=\"single-product.html\">Single Product</a></li>\r\n");
      out.write("													<li><a href=\"single-product-sale.html\">Single\r\n");
      out.write("															Product Sale</a></li>\r\n");
      out.write("													<li><a href=\"single-product-group.html\">Single\r\n");
      out.write("															Product Group</a></li>\r\n");
      out.write("													<li><a href=\"single-product-normal.html\">Single\r\n");
      out.write("															Product Normal</a></li>\r\n");
      out.write("													<li><a href=\"single-product-affiliate.html\">Single\r\n");
      out.write("															Product Affiliate</a></li>\r\n");
      out.write("												</ul></li>\r\n");
      out.write("										</ul></li>\r\n");
      out.write("									<li class=\"dropdown-holder\"><a\r\n");
      out.write("										href=\"blog-left-sidebar.html\">Blog</a>\r\n");
      out.write("										<ul class=\"hb-dropdown\">\r\n");
      out.write("											<li class=\"sub-dropdown-holder\"><a\r\n");
      out.write("												href=\"blog-left-sidebar.html\">Blog Grid View</a>\r\n");
      out.write("												<ul class=\"hb-dropdown hb-sub-dropdown\">\r\n");
      out.write("													<li><a href=\"blog-2-column.html\">Blog 2 Column</a></li>\r\n");
      out.write("													<li><a href=\"blog-3-column.html\">Blog 3 Column</a></li>\r\n");
      out.write("													<li><a href=\"blog-left-sidebar.html\">Grid Left\r\n");
      out.write("															Sidebar</a></li>\r\n");
      out.write("													<li><a href=\"blog-right-sidebar.html\">Grid Right\r\n");
      out.write("															Sidebar</a></li>\r\n");
      out.write("												</ul></li>\r\n");
      out.write("											<li class=\"sub-dropdown-holder\"><a\r\n");
      out.write("												href=\"blog-list-left-sidebar.html\">Blog List View</a>\r\n");
      out.write("												<ul class=\"hb-dropdown hb-sub-dropdown\">\r\n");
      out.write("													<li><a href=\"blog-list.html\">Blog List</a></li>\r\n");
      out.write("													<li><a href=\"blog-list-left-sidebar.html\">List\r\n");
      out.write("															Left Sidebar</a></li>\r\n");
      out.write("													<li><a href=\"blog-list-right-sidebar.html\">List\r\n");
      out.write("															Right Sidebar</a></li>\r\n");
      out.write("												</ul></li>\r\n");
      out.write("										</ul></li>\r\n");
      out.write("\r\n");
      out.write("									<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("									<li><a href=\"shop-left-sidebar.html\">Smartwatch</a></li>\r\n");
      out.write("									<li class=\"dropdown-holder\"><a>Account</a>\r\n");
      out.write("										<ul class=\"hb-dropdown\">\r\n");
      out.write("											<li><a href=\"customer-login.jsp\">Login</a></li>\r\n");
      out.write("											<li><a href=\"customer-registration.jsp\">Registration</a></li>\r\n");
      out.write("										</ul></li>\r\n");
      out.write("\r\n");
      out.write("								</ul>\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mobile-menu-area d-lg-none d-xl-none col-12\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"mobile-menu\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"js/vendor/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("	<!-- Popper js -->\r\n");
      out.write("	<script src=\"js/vendor/popper.min.js\"></script>\r\n");
      out.write("	<!-- Bootstrap V4.1.3 Fremwork js -->\r\n");
      out.write("	<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("	<!-- Ajax Mail js -->\r\n");
      out.write("	<script src=\"js/ajax-mail.js\"></script>\r\n");
      out.write("	<!-- Meanmenu js -->\r\n");
      out.write("	<script src=\"js/jquery.meanmenu.min.js\"></script>\r\n");
      out.write("	<!-- Wow.min js -->\r\n");
      out.write("	<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("	<!-- Slick Carousel js -->\r\n");
      out.write("	<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("	<!-- Owl Carousel-2 js -->\r\n");
      out.write("	<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("	<!-- Magnific popup js -->\r\n");
      out.write("	<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("	<!-- Isotope js -->\r\n");
      out.write("	<script src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("	<!-- Imagesloaded js -->\r\n");
      out.write("	<script src=\"js/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("	<!-- Mixitup js -->\r\n");
      out.write("	<script src=\"js/jquery.mixitup.min.js\"></script>\r\n");
      out.write("	<!-- Countdown -->\r\n");
      out.write("	<script src=\"js/jquery.countdown.min.js\"></script>\r\n");
      out.write("	<!-- Counterup -->\r\n");
      out.write("	<script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("	<!-- Waypoints -->\r\n");
      out.write("	<script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("	<!-- Barrating -->\r\n");
      out.write("	<script src=\"js/jquery.barrating.min.js\"></script>\r\n");
      out.write("	<!-- Jquery-ui -->\r\n");
      out.write("	<script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("	<!-- Venobox -->\r\n");
      out.write("	<script src=\"js/venobox.min.js\"></script>\r\n");
      out.write("	<!-- Nice Select js -->\r\n");
      out.write("	<script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("	<!-- ScrollUp js -->\r\n");
      out.write("	<script src=\"js/scrollUp.min.js\"></script>\r\n");
      out.write("	<!-- Main/Activator js -->\r\n");
      out.write("	<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"breadcrumb-area\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"breadcrumb-content\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("					<li class=\"active\">Register</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"page-section mb-60\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-sm-10 col-md-10 col-lg-10 col-xs-10\">\r\n");
      out.write("					<form action=\"ClientController\" method=\"post\">\r\n");
      out.write("						");

						String msg = (String) request.getAttribute("msg");
						
      out.write("\r\n");
      out.write("						");

						if (msg != null) {
						
      out.write("\r\n");
      out.write("						<h3 align=\"center\">\r\n");
      out.write("							");

							out.print(msg);
							
      out.write("\r\n");
      out.write("						</h3>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("						<div class=\"login-form\">\r\n");
      out.write("							<h4 class=\"login-title\">Registration</h4>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("								<div class=\"col-md-6 col-12 mb-20\">\r\n");
      out.write("									<label>First Name</label> <input class=\"mb-0\" type=\"text\"\r\n");
      out.write("										placeholder=\"First Name\" name=\"fname\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 col-12 mb-20\">\r\n");
      out.write("									<label>Last Name</label> <input class=\"mb-0\" type=\"text\"\r\n");
      out.write("										placeholder=\"Last Name\" name=\"lname\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-20\">\r\n");
      out.write("									<label>Email Address*</label> <input class=\"mb-0\" type=\"email\"\r\n");
      out.write("										placeholder=\"Email Address\" name=\"email\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-20\">\r\n");
      out.write("									<label>Password</label> <input class=\"mb-0\" type=\"password\"\r\n");
      out.write("										id=\"password1\" placeholder=\"Password\" name=\"password\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-20\">\r\n");
      out.write("									<label>City</label> <input class=\"mb-0\" type=\"city\" name=\"city\"\r\n");
      out.write("										placeholder=\"Enter City\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-20\">\r\n");
      out.write("									<label>Contact</label> <input class=\"mb-0\" type=\"contact\"\r\n");
      out.write("										name=\"contact\" placeholder=\"Enter contact\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-12\">\r\n");
      out.write("									<button class=\" btn btn-primary mt-0\" name=\"action\"\r\n");
      out.write("										value=\"register\">Sign Up</button>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("								<p class=\"text-center\">\r\n");
      out.write("								<h6>Buying for work?</h6>\r\n");
      out.write("								<a\r\n");
      out.write("									class=\"   text-primary  link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover\"\r\n");
      out.write("									href=\"Seller-Registration.jsp\"> Create a free business\r\n");
      out.write("									account </a>\r\n");
      out.write("								</p>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"text-center\">\r\n");
      out.write("\r\n");
      out.write("								<h5>Already have an account?</h5>\r\n");
      out.write("								<a\r\n");
      out.write("									class=\"   text-primary  link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover\"\r\n");
      out.write("									href=\"customer-login.jsp\"> Sign in </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}