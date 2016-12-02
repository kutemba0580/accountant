package ua.com.alfacell.utilites;// Created by Ponomarenko Oleh on 09.11.2016.

import ua.com.alfacell.dao.impl.CategoryDaoImpl;
import ua.com.alfacell.dao.impl.ShopDaoImpl;
import ua.com.alfacell.dao.impl.UserDaoImpl;
import ua.com.alfacell.models.Category;
import ua.com.alfacell.models.Role;
import ua.com.alfacell.models.Shop;
import ua.com.alfacell.models.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class Listener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public Listener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        insertShops();
        insertAdmin();
        insertCategories();
    }

    private void insertCategories() {
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        if (categoryDao.findAll().size() == 0) {
            Category category = new Category();
            category.setNameCategory("Телефоны");
            categoryDao.save(category);

            category = new Category();
            category.setNameCategory("Чехлы");
            categoryDao.save(category);
        }

    }

    private void insertAdmin() {
        UserDaoImpl userDao = new UserDaoImpl();
        if (userDao.findAll().size() == 0) {
            User user = new User();
            user.setLogin("admin");
            user.setPassword("admin");
            user.setEmail("admin@alfacell.com.ua");
            user.setRole(Role.ADMIN);
            userDao.save(user);
        }
    }

    private void insertShops() {
        ShopDaoImpl shopDao = new ShopDaoImpl();

        if (shopDao.findAll().size() == 0) {
            Shop shop = new Shop();
            shop.setNameShop("Ленина");
            shopDao.save(shop);

            shop = new Shop();
            shop.setNameShop("Университетская");
            shopDao.save(shop);

            shop = new Shop();
            shop.setNameShop("Алексеевка");
            shopDao.save(shop);

            shop = new Shop();
            shop.setNameShop("Французский булвьар");
            shopDao.save(shop);

            shop = new Shop();
            shop.setNameShop("пл. Свободы");
            shopDao.save(shop);

            shop = new Shop();
            shop.setNameShop("Петровского");
            shopDao.save(shop);
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}