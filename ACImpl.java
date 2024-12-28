/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc;

/**
 *
 * @author ASUS
 */
public class ACImpl implements AC {
    private boolean isOn = false;
    public void hidupkanAC() {
        isOn = true;
        System.out.println("AC dinyalakan.");
    }

    public void matikanAC() {
        isOn = false;
        System.out.println("AC dimatikan.");
    }

    public void dinginkanAC() {
        if (isOn) {
            System.out.println("AC sedang mendinginkan ruangan.");
        } else {
            System.out.println("AC tidak dapat mendinginkan karena dalam keadaan mati.");
        }
    }

    public void panaskanAC() {
        if (isOn) {
            System.out.println("AC sedang memanaskan ruangan.");
        } else {
            System.out.println("AC tidak dapat memanaskan karena dalam keadaan mati.");
        }
    }
}