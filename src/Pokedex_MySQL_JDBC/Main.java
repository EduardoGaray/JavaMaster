package Pokedex_MySQL_JDBC;
//import jdbc drivers

import com.sun.java.util.jar.pack.DriverResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    //create a connection to the database
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokedex", "root", "");
            //Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("select * from pokemon");
            //create window with a button to add a pokemon to the database
            JFrame frame = new JFrame("Pokédex");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(510, 510);
            frame.setResizable(false);
            frame.setLayout(null);
            //add pane to frame
            JPanel panel_list = new JPanel();
            panel_list.setLayout(null);
            //panel dimensions
            panel_list.setSize((int) (frame.getWidth() / 1.5), frame.getHeight() - 50);
            panel_list.setOpaque(false);
            //panel location
            panel_list.setLocation(10, 5);
            frame.add(panel_list);
            List<String> myList = new ArrayList<>(10);
            for (int index = 0; index < 152; index++) {
                //myList.add("List Item " + index);
                myList.add("Bulbasaur");
            }
            final JList<String> list = new JList<String>(myList.toArray(new String[myList.size()]));
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setViewportView(list);
            list.setLayoutOrientation(JList.VERTICAL);
            list.setBorder(BorderFactory.createTitledBorder("Contents"));
            scrollPane.setBounds(0, 0, panel_list.getWidth(), panel_list.getHeight());
            //add list to frame
            panel_list.add(scrollPane);
            //second panel
            JPanel panel_seen = new JPanel();
            //panel dimensions
            panel_seen.setSize((frame.getWidth() / 4), frame.getHeight() / 2);
            panel_seen.setBorder(BorderFactory.createTitledBorder("Status"));
            //panel location
            panel_seen.setLocation(panel_list.getWidth() + 20, 5);
            frame.add(panel_seen);
            //third panel
            JPanel panel_data = new JPanel();
            panel_data.setLayout(null);
            //panel dimensions
            panel_data.setSize((frame.getWidth() / 4), (int) (frame.getHeight() / 2.56));
            //panel border
            panel_data.setBorder(BorderFactory.createTitledBorder("Commands"));
            //panel location
            panel_data.setLocation(panel_list.getWidth() + 20, panel_seen.getHeight() + 10);
            frame.add(panel_data);
            //add buttons to panel
            JButton button_data = new JButton("Data");
            JButton button_cry = new JButton("Cry");
            JButton button_area = new JButton("Area");
            JButton button_quit = new JButton("Quit");
            //button dimensions
            button_data.setSize(panel_data.getWidth(), panel_data.getHeight() / 4);
            button_cry.setSize(panel_data.getWidth(), panel_data.getHeight() / 4);
            button_area.setSize(panel_data.getWidth(), panel_data.getHeight() / 4);
            button_quit.setSize(panel_data.getWidth(), panel_data.getHeight() / 4);
            //button location
            button_data.setLocation(0, 0);
            button_cry.setLocation(0, button_data.getHeight());
            button_area.setLocation(0, button_cry.getHeight() + button_data.getHeight());
            button_quit.setLocation(0, button_area.getHeight() + button_cry.getHeight() + button_data.getHeight());
            //add buttons to panel
            panel_data.add(button_data);
            panel_data.add(button_cry);
            panel_data.add(button_area);
            panel_data.add(button_quit);
            //add action listeners to buttons
            button_data.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //create a new window to display the data
                    JFrame frame_data = new JFrame("Data");
                    frame_data.setSize(510, 510);
                    frame_data.setResizable(false);
                    frame_data.setLayout(null);
                    frame_data.setVisible(true);
                }
            });
            button_cry.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   //reproduce the sound file of the pokemon
                    String pokemon_name = list.getSelectedValue();
                    String file_name = pokemon_name.toLowerCase().replaceAll(" ", "_");
                    String file_path = "./res/sounds/" + file_name + ".wav";
                    AePlayWave aw = new AePlayWave( file_path );
                    aw.start();

                }
            });
            button_quit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            frame.setVisible(false);
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


