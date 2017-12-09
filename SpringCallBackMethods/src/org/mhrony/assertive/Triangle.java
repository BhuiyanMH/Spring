package org.mhrony.assertive;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA, pointB, pointC;
	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {

		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ") ");
		System.out.println("Point  B= (" + getPointB().getX() + ", " + getPointB().getY() + ") ");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ") ");

	}

	@Override
	public void setBeanName(String beanName) {

		System.out.println("Name of the Bean is: " + beanName);

	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {

		this.context = context;

	}

	/*
	 * one way to test callback methods is implementing these interfaces,
	 * InitializingBean and DisposableBean
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method called for Triangle"); }
	 * 
	 * 
	 * @Override public void destroy() throws Exception { System.out.println(
	 * "DisposableBean destroy method called for Triangle"); }
	 */
	
	public void myInit(){
		System.out.println("My Init method called for the bean Triangle");
	}
	
	public void cleanUp(){
		System.out.println("My destroy method called for bean Triangle");
	}

}
