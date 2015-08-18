/**
 * This is an example showing how to make full use of the RadioMenuItem
 * and RadioMenuItemGroup classes you should have received with this file.
 *
 * @title Example.java
 * @author uPaymeiFixit
 * @version 1.2
 * @since 2015-08-17
 */

import java.awt.AWTException;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Example
{
    public static void main( String[] args )
    {
        if ( SystemTray.isSupported() )
        {

            final PopupMenu popup = new PopupMenu();
            final Image image = Toolkit.getDefaultToolkit().getImage("icon.gif");
            final TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");
            final SystemTray tray = SystemTray.getSystemTray();


            // Group 1
            RadioMenuItemGroup g1 = new RadioMenuItemGroup();
            RadioMenuItem a1 = new RadioMenuItem( "A1", g1 );
            RadioMenuItem a2 = new RadioMenuItem( "A2", true );
            a2.setRadioMenuItemGroup( g1 );
            RadioMenuItem a3 = new RadioMenuItem( "A3", g1, true );
            RadioMenuItem a4 = new RadioMenuItem( "A4" );
            g1.addRadioMenuItem( a4 );

            g1.setSelectedRadioMenuItem( a4 );

            System.out.println( g1.getSelectedRadioMenuItem().getLabel() );
            // A4
            System.out.println( g1 );
            // [A1: false, A2: false, A3: false, A4: true]


            // Add a listener so we can act when the user clicks this item
            a4.addItemListener( new ItemListener()
            {
                @Override
                public void itemStateChanged(ItemEvent e)
                {
                    if ( e.getStateChange() == ItemEvent.SELECTED )
                        System.out.println( a4.getLabel() + " has been checked." );
                    else
                        System.out.println( a4.getLabel() +  " has been unchecked" );
                }
            });

            popup.add(a1);
            popup.add(a2);
            popup.add(a3);
            popup.add(a4);

            trayIcon.setPopupMenu(popup);

            try
            {
                tray.add(trayIcon);
            }
            catch (AWTException e)
            {
                System.out.println("TrayIcon could not be loaded.");
            }

        }
        else
        {
            System.out.println("Tray is not supported");
        }
    }
}
