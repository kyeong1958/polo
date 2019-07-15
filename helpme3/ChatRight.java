package com.helpme3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.net.MalformedURLException;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

public class ChatRight extends JPanel{
   ////////
   JPanel jp_time;
   ////////
    JLabel jlb_right;
    JLabel jlb_time;
    public JLabel jlb_rightimg;
    JPanel chat_right;
    String imgPath = "C:\\workspace_java\\dev_java\\src\\images\\";
    public ChatRight(String id) throws MalformedURLException {
       jp_time = new JPanel(new BorderLayout());
       jlb_rightimg = new JLabel();
       jlb_time = new JLabel();
//       jlb_right.setIcon(new ImageIcon(imgPath+"lion22.png"));
       jlb_rightimg.setText("어디까지 늘어나냐");
       jlb_time.setText("13:00");
       jlb_time.setHorizontalAlignment(JLabel.RIGHT);
       //
       jp_time.add("South", jlb_time);
       jp_time.setOpaque(false);
       //
        chat_right = new ChatRightBubble();
        jlb_right = new JLabel();   
        this.setOpaque(false);
        this.setAlignmentX(SwingConstants.RIGHT);
        /////////////////RIGHT BUBBLE/////////////////////////////
        GroupLayout chat_rightLayout = new GroupLayout(chat_right);
        chat_right.setLayout(chat_rightLayout);
        chat_rightLayout.setHorizontalGroup(
              chat_rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(GroupLayout.Alignment.TRAILING, chat_rightLayout.createSequentialGroup()
              .addGap(25, 25, 25)//말풍선 안에 말풍선과 문장 시작 부분 gap
                .addComponent(jlb_rightimg)        
                .addGap(31, 31, 31))
        );
        chat_rightLayout.setVerticalGroup(
              chat_rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(chat_rightLayout.createSequentialGroup()
              .addGap(6, 6, 6) 
              .addComponent(jlb_rightimg)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
 
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);     
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()   
                  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addContainerGap()
                  .addGap(6,6,6)
                  .addContainerGap()
                  .addComponent(jp_time)
                  .addGap(15,15,15)
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                  .addComponent(chat_right, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlb_right)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jlb_right)
                .addComponent(jp_time)
                .addComponent(chat_right, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap()
                )
        );
    }
}