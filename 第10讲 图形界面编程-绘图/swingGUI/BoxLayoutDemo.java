package swing.layout;
/*
 * 
布局管理器：BoxLayout
 * 当 BoxLayout 进行布局时，它将所有控件依次按照控件的优先尺寸按照顺序的进行水平或者垂直放置，
 * 假如布局的整个水平或者垂直空间的尺寸不能放下所有控件，
 * 那么 BoxLayout 会试图调整各个控件的大小来填充整个布局的水平或者垂直空间。
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class BoxLayoutDemo {

	//定义三个面板
	static JPanel topPanel=null;
	static JPanel middlePanel=null;
	static JPanel bottomPanel=null;

	//顶部
	static void createTopPanel() { 
		 topPanel = new JPanel(); 
		 String[] columnName = { "姓名", "性别", "单位", "参加项目", "备注" }; 
		 String[][] rowData = { { "张三", "男", "计算机系", "100 米 ,200 米", "" },
				 { "李四", "男", "化学系", "100 米，铅球", "" }}; 
		            // 创建表格
		 JTable table = new JTable(new DefaultTableModel(rowData, columnName)); 
		            // 创建包含表格的滚动窗格
		 JScrollPane scrollPane = new JScrollPane(table);
		 scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		            // 定义 topPanel 的布局为 BoxLayout，BoxLayout 为垂直排列
		 topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS)); 
		            // 先加入一个不可见的 Strut，从而使 topPanel 对顶部留出一定的空间
		 topPanel.add(Box.createVerticalStrut(10)); 
		            // 加入包含表格的滚动窗格 
		 topPanel.add(scrollPane); 
		            // 再加入一个不可见的 Strut，从而使 topPanel 和 middlePanel 之间留出一定的空间
		 topPanel.add(Box.createVerticalStrut(10)); 
	}
	
	//中部
	static void createMiddlePanel() { 
		 // 创建 middlePanel 
		 middlePanel = new JPanel(); 
		 // 采用水平布局
		 middlePanel .setLayout(new BoxLayout(middlePanel,BoxLayout.X_AXIS)); 
		 // 创建标签运动会项目        
		 JLabel sourceLabel = new JLabel("运动会项目："); 
		 sourceLabel.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 sourceLabel.setBorder(BorderFactory.createEmptyBorder (4, 5, 0, 5)); 
		 // 创建列表运动会项目
		 DefaultListModel listModel = new DefaultListModel(); 
		 listModel.addElement("100 米"); 
		 listModel.addElement("200 米"); 
		 listModel.addElement("400 米"); 
		 listModel.addElement("跳远"); 
		 listModel.addElement("跳高"); 
		 listModel.addElement("铅球"); 
		 //用DefaultListModel类对象来构造一个JList列表
		 JList sourceList = new JList(listModel); 
		 sourceList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ); 
		 sourceList.setVisibleRowCount(5); 
		 JScrollPane sourceListScroller = new JScrollPane(sourceList); 
		 sourceListScroller.setPreferredSize(new Dimension(120, 80)); 
		 sourceListScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ); 
		 sourceListScroller.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 // 创建最左边的 Panel 
		 JPanel sourceListPanel = new JPanel(); 
		 // 最左边的 Panel 采用水平布局
		 sourceListPanel.setLayout(new BoxLayout(sourceListPanel,BoxLayout.X_AXIS )); 
		 // 加入标签到最左边的 Panel 
		 sourceListPanel.add(sourceLabel); 
		 // 加入列表运动会项目到最左边的 Panel 
		 sourceListPanel.add(sourceListScroller); 
		 sourceListPanel.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 sourceListPanel.setBorder(BorderFactory.createEmptyBorder (0, 0, 0, 30)); 
		 // 将最左边的 Panel 加入到 middlePanel 
		 middlePanel .add(sourceListPanel); 
		 // 定义中间的两个按钮        
		 JButton toTargetButton = new JButton(">>"); 
		 JButton toSourceButton = new JButton("<<"); 
		 // 定义中间的 Panel 
		 JPanel buttonPanel = new JPanel(); 
		 // 中间的 Panel 采用水平布局
		 buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS )); 
		 // 将按钮 >> 加入到中间的 Panel 
		 buttonPanel.add(toTargetButton); 
	
		//两个按钮之间加入一个不可见的 rigidArea            
		 buttonPanel.add(Box.createRigidArea (new Dimension(15, 15))); 
		 // 将按钮 << 加入到中间的 Panel 
		 buttonPanel.add(toSourceButton); 
		 buttonPanel.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 buttonPanel.setBorder(BorderFactory.createEmptyBorder (15, 5, 15, 5)); 
		 // 将中间的 Panel 加入到 middlePanel 
		 middlePanel .add(buttonPanel); 
		 // 创建标签查询项目
		 JLabel targetLabel = new JLabel("查询项目："); 
		 targetLabel.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 targetLabel.setBorder(BorderFactory.createEmptyBorder (4, 5, 0, 5)); 
	
		// 创建列表查询项目            
		 DefaultListModel targetListModel = new DefaultListModel(); 
		 targetListModel.addElement("100 米"); 
		 JList targetList = new JList(targetListModel); 
		 targetList 
		 .setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ); 
		 targetList.setVisibleRowCount(5); 
		 JScrollPane targetListScroller = new JScrollPane(targetList); 
		 targetListScroller.setPreferredSize(new Dimension(120, 80)); 
		 targetListScroller 
		 .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ); 
		 targetListScroller.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 // 创建最右边的 Panel 
		 JPanel targetListPanel = new JPanel(); 
		 // 设置最右边的 Panel 为水平布局
		 targetListPanel.setLayout(new BoxLayout(targetListPanel,BoxLayout.X_AXIS )); 
		 // 将标签查询项目加到最右边的 Panel 
		 targetListPanel.add(targetLabel); 
		 // 将列表查询项目加到最右边的 Panel 
		 targetListPanel.add(targetListScroller); 
		 targetListPanel.setAlignmentY(Component.TOP_ALIGNMENT ); 
		 targetListPanel.setBorder(BorderFactory.createEmptyBorder (0, 30, 0, 0)); 
		 // 最后将最右边的 Panel 加入到 middlePanel 
		 middlePanel .add(targetListPanel); 
	}
	
	//底部
	static void createBottomPanel() { 
	    // 创建查询按钮
		JButton actionButton = new JButton("查询"); 
		 // 创建退出按钮
		JButton closeButton = new JButton("退出"); 
		 // 创建 bottomPanel 
		bottomPanel = new JPanel(); 
		    // 设置 bottomPanel 为垂直布局
		bottomPanel .setLayout(new BoxLayout(bottomPanel,BoxLayout.Y_AXIS )); 
		    // 创建包含两个按钮的 buttonPanel 
		JPanel buttonPanel = new JPanel(); 
		 // 设置 bottomPanel 为水平布局
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS )); 
		    // 将查询按钮加入到 buttonPanel 
		buttonPanel.add(actionButton); 
		
		//加入一个 glue, glue 会挤占两个按钮之间的空间            
		buttonPanel.add(Box.createHorizontalGlue ()); 
		    // 将退出按钮加入到 buttonPanel 
		buttonPanel.add(closeButton); 
		    // 加入一个 Strut，从而使 bottomPanel 和 middlePanel 上下之间留出距离
		bottomPanel .add(Box.createVerticalStrut (10)); 
		    // 加入 buttonPanel 
		bottomPanel .add(buttonPanel); 
		    // 加入一个 Strut，从而使 bottomPanel 和底部之间留出距离
		bottomPanel .add(Box.createVerticalStrut (10)); 
	}
	public static void main(String[] args) { 
	    // 创建 topPanel 
		createTopPanel (); 
		 // 创建 middlePanel 
		createMiddlePanel (); 
		 // 创建 bottomPanel 
		createBottomPanel (); 
		 // 创建包含 topPanel，middlePanel 和 bottomPanel 的 panelContainer 
		JPanel panelContainer = new JPanel(); 
		 //panelContainer 的布局为 GridBagLayout 
		panelContainer.setLayout(new GridBagLayout()); 
		
		GridBagConstraints c1 = new GridBagConstraints(); 
		c1.gridx = 0; 
		c1.gridy = 0; 
		c1.weightx = 1.0; 
		c1.weighty = 1.0; 
		c1.fill = GridBagConstraints.BOTH ; 
		 // 加入 topPanel 
		panelContainer.add(topPanel,c1); 
		
		GridBagConstraints c2 = new GridBagConstraints(); 
		c2.gridx = 0; 
		c2.gridy = 1; 
		c2.weightx = 1.0; 
		c2.weighty = 0; 
		c2.fill = GridBagConstraints.HORIZONTAL ; 
		 // 加入 middlePanel 
		panelContainer.add(middlePanel,c2); 
		
		GridBagConstraints c3 = new GridBagConstraints(); 
		c3.gridx = 0; 
		c3.gridy = 2; 
		c3.weightx = 1.0; 
		c3.weighty = 0; 
		c3.fill = GridBagConstraints.HORIZONTAL ; 
		 // 加入 bottomPanel 
		panelContainer.add(bottomPanel,c3); 
		
		 // 创建窗体
		JFrame frame = new JFrame("Boxlayout 演示"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); 
		panelContainer.setOpaque(true); 
		frame.setSize(new Dimension(480, 320)); 
		frame.setContentPane(panelContainer); 
		frame.setVisible(true); 
	}
}
/*
*BoxLayout 往往和 Box 这个容器结合在一起使用，这么做的理由是，
*BoxLayout 是把控件以水平或者垂直的方向一个接一个的放置，如果要调整这些控件之间的空间，
*就会需要使用 Box 容器提供的透明的组件作为填充来填充控件之间的空间，从而达到调整控件之间的间隔空间的目的。
*Box 容器提供了 4 种透明的组件，分别是 rigidarea、strut、glue、filler。
*Box 容器分别提供了不同的方法来创建这些组件。
*这四个组件的特点如下：
*   Rigid area 是一种用户可以定义水平和垂直尺寸的透明组件；
*   strut 与 rigid area 类似，但是用户只能定义一个方向的尺寸，即水平方向或者垂直方向，不能同时定义水平和垂直尺寸；
*   当用户将 glue 放在两个控件之间时，它会尽可能的占据两个控件之间的多余空间，从而将两个控件挤到两边；
*   Filler 是 Box 的内部类，它与 rigid area 相似，都可以指定水平或者垂直的尺寸，但是它可以设置最小，最大和优先尺寸。
*/