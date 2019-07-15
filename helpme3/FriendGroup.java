package com.helpme3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FriendGroup extends JPanel{


	Friendstuts t = null;
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp2_1 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = null;

	JLabel jl1 = new JLabel();//사진
	JLabel jl2 = new JLabel();//이름
	JLabel jl3 = new JLabel();//상태표시

	String imgPath="C:\\workspace_java\\dev_java\\src\\images\\";
	
	public FriendGroup() { 

			
			
			 }
	public void initDisplay(Map<String, Object> map) {
		jl1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource().equals(jl1)) {
					FirendDialog fd = new FirendDialog();
					fd.initDisplay(map);
				}
			}
		});
		
		//이미지 자르기 경로에 VO.getimg 넣기
		ImageIcon img = new ImageIcon(imgPath+map.get("mem_img").toString()+"1.png");
		Image originImg = img.getImage(); 
		Image changedImg= originImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH );		
		//이미지 자르기 끝
		jl1.setIcon(new ImageIcon(changedImg));
		jl2.setText(map.get("mem_nick").toString());
		jl3.setText(map.get("mem_status").toString());
		int di = jl3.getMaximumSize().width;			  	
		Friendstuts t = new Friendstuts(di);
		jp4 = new Friendstuts(di);
		
		jp2.setLayout(new BorderLayout());	
		jp3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		jl2.setVerticalAlignment(JLabel.CENTER);
		jp1.add(jl1);
		jp2.add(jl2);
		jp3.add(jp4);      
		jp4.add(jl3);  
		
		GroupLayout gl = new GroupLayout(this);	   
		this.setLayout(gl);
		
		
		// 수직
		gl.setHorizontalGroup(gl.createSequentialGroup()	             
		              .addComponent(jp1, 50, 50, GroupLayout.PREFERRED_SIZE)	             
		              .addComponent(jp2, 158, 158, GroupLayout.PREFERRED_SIZE)	              
		              .addComponent(jp3));
		// 수평
		    gl.setVerticalGroup(gl.createSequentialGroup()
		          .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
		                .addComponent(jp1, 50, 50, GroupLayout.PREFERRED_SIZE)
		                .addComponent(jp2, 50, 50, GroupLayout.PREFERRED_SIZE)
		                .addComponent(jp3)));
	}
	
}
