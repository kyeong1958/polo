package com.helpme3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

public class ChatListView extends JPanel {
	JTextField jtf_search = new JTextField("채팅방 이름, 참여자 검색");
	MainView mv = null;
	
	JPanel jp_img = new JPanel();
	JPanel jp_second = new JPanel();
	JPanel jp_time = new JPanel();
	JLabel jl_img = new JLabel("프사", JLabel.CENTER);
	JLabel jl_name = new JLabel("이름", JLabel.LEFT);
	JLabel jl_msg = new JLabel("마지막메세지", JLabel.LEFT);
	JLabel jl_time = new JLabel("시간", JLabel.RIGHT);
	
	public ChatListView(MainView mv) {
		this.mv = mv;
		jtf_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jtf_search.setText("");
			}
		});
		jp_img.setLayout(new BorderLayout());
		jp_second.setLayout(new BorderLayout());
		jp_time.setLayout(new BorderLayout());
		jp_second.setLayout(new GridLayout(2,1));
		jp_img.add(jl_img);
		jp_second.add(jl_name);
		jp_second.add(jl_msg);
		jp_time.add(jl_time);
		
		GroupLayout gl = new GroupLayout(this);
		this.setLayout(gl);
		//수평 그룹
		gl.setHorizontalGroup(
				//순차적으로 그룹을 붙히겠다
				gl.createSequentialGroup()
				.addComponent(jp_img, 70, 70, 70)
				//DEFAULT_SIZE : 늘리면 늘리는 만큼 늘어남
				.addComponent(jp_second, 300, 300, GroupLayout.DEFAULT_SIZE)
				.addComponent(jp_time, 70, 70, 70)
				);
	   //수직 그룹
	   gl.setVerticalGroup(
	         //순차적으로 그룹을 붙히겠다
	         gl.createSequentialGroup()
	            .addGroup(gl.createParallelGroup(Alignment.BASELINE)
	                  .addComponent(jp_img, 80, 80, GroupLayout.PREFERRED_SIZE)
	                  .addComponent(jp_second, 80, 80, GroupLayout.PREFERRED_SIZE)
	                  .addComponent(jp_time, 80, 80, GroupLayout.PREFERRED_SIZE)
	                  )
	         );
	}

}