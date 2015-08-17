# RadioMenuItem-for-java.awt
A RadioMenuItem and RadioMenuItemGroup class that extends java.awt.CheckboxMenuItem

java.awt does not have a RadioMenuItem which can be used with the System Tray, so I made one. This class extends java.awt.CheckboxMenuItem, and therefore acts very similar. The difference is that only one radio menu item can be checked per group. 

##RadioMenuItem Documentation

####Constructor Summary
`RadioMenuItem()`
Create a radio menu item with an empty label.

`RadioMenuItem(String label)`
Create a radio menu item with the specified label.

`RadioMenuItem(String label, RadioMenuItemGroup group)`
Create a radio menu item with the specified label, in the specified radio menu item group.

`RadioMenuItem(String label, boolean state)`
Create a radio menu item with the specified label, set to the specified state.

`RadioMenuItem(String label, RadioMenuItemGroup group)`
Create a radio menu item with the specified label, in the specified radio menu item group, and set to the specified state.

####Method Summary
`RadioMenuItemGroup getRadioMenuItemGroup()`
Returns the radio menu item's group.

`void setRadioMenuItemGroup(RadioMenuItemGroup group)`
Sets the radio menu item's group.

####Inherited Methods
See the [CheckboxMenuItem Javadoc](http://docs.oracle.com/javase/7/docs/api/java/awt/CheckboxMenuItem.html).

##RadioMenuItemGroup Documentation

####Constructor Summary
`RadioMenuItemGroup()`
Create a new instance of RadioMenuItemGroup.

####Method Summary
`RadioMenuItem getSelectedRadioMenuItem()`
Gets the currently selected radio menu item from the group. If all items are in the "off" state, null is returned.

`void setSelectedRadioMenuItem(RadioMenuItem radio)`
Sets the currently selected radio menu item in this group to be the specified radio menu item. If the radio argument is null, all radio menu items in this group will be deselected. Note: this will not invoke a call to an ItemListener.

`String toString()`
Returns a string representation of this radio menu item group, including the labels and currect selection values.

##Usage

Place the RadioMenuItem.java and RadioMenuItemGroup.java files in your class path. 

##Example
Check out Example.java to see a working example.
