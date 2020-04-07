import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public void MainWindow(){
        WeightConv w = new WeightConv();
        DistanceConv d = new DistanceConv();
        VolumeConv v = new VolumeConv();

        JFrame fr = new JFrame("Unit Conversion");

        JPanel panel = new JPanel(new GridLayout(6,2,5,10));
        JTextField convertThis = new JTextField();
        panel.add(convertThis);

        String[] units = {"", "m", "mm", "g", "kg", "lb", "ft"};
        JComboBox unitList = new JComboBox(units);
        panel.add(unitList);
        unitList.setSelectedIndex(0);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,500);
        fr.getContentPane().add(panel);
        fr.setVisible(true);

        unitList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selected = (String) combo.getSelectedItem();

                if(selected.equals("m")){
                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);
                    Double m = d.toFT(Double.parseDouble(convertThis.getText()));
                    JTextField feet = new JTextField(Double.toString(m));
                    panel.add(feet);
                    Label feetLabel = new Label("ft");
                    panel.add(feetLabel);
                    JTextField mm = new JTextField(Double.toString(d.toMM(Double.parseDouble(convertThis.getText()))));
                    panel.add(mm);
                    Label mmLabel = new Label("mm");
                    panel.add(mmLabel);

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);

                } else if(selected.equals("g")){

                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);
                    Double weight = Double.parseDouble(convertThis.getText());
                    JTextField lbs = new JTextField(Double.toString(w.toPounds(weight)));
                    panel.add(lbs);
                    Label pounds = new Label("pounds");
                    panel.add(pounds);
                    JTextField kg  = new JTextField(Double.toString(w.toKG(weight)));
                    panel.add(kg);
                    Label kglabel = new Label("kg");
                    panel.add(kglabel);

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);
                }else if(selected.equals("mm")){
                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);

                    Double distance = Double.parseDouble(convertThis.getText());
                    JTextField meters = new JTextField(Double.toString(d.toMFromMM(distance)));
                    panel.add(meters);
                    Label meterz = new Label("m");
                    panel.add(meterz);
                    JTextField feet = new JTextField(Double.toString(d.toFT(d.toMFromMM(distance))));
                    panel.add(feet);
                    Label feetz = new Label("feet");
                    panel.add(feetz);

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);

                }else if(selected.equals("kg")){
                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);

                    Double weight = Double.parseDouble(convertThis.getText());
                    JTextField grams = new JTextField(Double.toString(w.toGFROMKG(weight)));
                    panel.add(grams);
                    Label gramz = new Label("g");
                    panel.add(gramz);
                    JTextField pounds = new JTextField(Double.toString(w.toPounds(w.toGFROMKG(weight))));
                    panel.add(pounds);
                    Label poundz = new Label("lbs");
                    panel.add(poundz);

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);
                }else if(selected.equals("lb")){
                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);

                    Double weight = Double.parseDouble(convertThis.getText());
                    JTextField g = new JTextField(Double.toString(w.toGrams(weight)));
                    panel.add(g);
                    Label gz = new Label("g");
                    panel.add(gz);
                    JTextField kg = new JTextField(Double.toString(w.toKG(w.toGrams(weight))));
                    panel.add(kg);
                    Label kgz = new Label("kg");

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);
                }else if(selected.equals("ft")){
                    panel.removeAll();
                    panel.updateUI();
                    panel.add(convertThis);
                    panel.add(unitList);

                    Double distance = Double.parseDouble(convertThis.getText());
                    JTextField meters = new JTextField(Double.toString(d.toM(distance)));
                    panel.add(meters);
                    Label meter = new Label("m");
                    panel.add(meter);
                    JTextField mm = new JTextField(Double.toString(d.toMM(d.toM(distance))));
                    panel.add(mm);
                    Label mms = new Label("mm");
                    panel.add(mms);

                    fr.getContentPane().add(panel);
                    fr.setVisible(true);

                }

            }
        });


    }

}
