package UIComponent;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import UIComponent.MyColor;

public class MyComboBoxRenderer implements ListCellRenderer<Object> {

	private DefaultListCellRenderer defaultCellRenderer = new DefaultListCellRenderer();

	public MyComboBoxRenderer() {
		super();
	}

	public Component getListCellRendererComponent(@SuppressWarnings("rawtypes") JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

		JLabel renderer = (JLabel) defaultCellRenderer
				.getListCellRendererComponent(list, value, index, isSelected,
						cellHasFocus);
		if (isSelected) {
			renderer.setBackground(MyColor.BLUE.getColor());//XUtil.defaultComboBoxBoundsColor
			renderer.setForeground(MyColor.WHITE.getColor());
		} else {
			renderer.setForeground(MyColor.BLACK.getColor());
			renderer.setBackground(MyColor.WHITE.getColor());
		}
		list.setSelectionBackground(new Color(245,245,245));
		list.setBorder(null);
		renderer.setFont(new Font("黑体", Font.PLAIN, 12));
		renderer.setHorizontalAlignment(JLabel.LEFT);
		return renderer;
	}
}