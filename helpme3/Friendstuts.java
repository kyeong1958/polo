package com.helpme3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Friendstuts extends JPanel {
		FriendstutsVO t = new FriendstutsVO();
		
	  Shape s = null;
	  int i;
	  public Friendstuts() {
	  }
	  public Friendstuts(int di) {
		  t.setDi(di);
		  i =  t.getDi();
		  new Friendstuts();
		  
	  }
	@Override
   protected void paintComponent(final Graphics g) {

		  //상태 표시창 배경 버블 생성
		  s = new RoundRectangle2D.Float(0,3,t.getDi()+8,23,20,20);
		  final Graphics2D g2 = (Graphics2D) g;
	      g2.setColor(new Color(255, 218, 121));	     
	      g2.setStroke(new BasicStroke(3));
	      g2.fill(s);
	   }
}
