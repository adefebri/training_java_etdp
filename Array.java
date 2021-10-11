import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array{public static void main(String[] args){
    
    



    ArrayList<String> list = new ArrayList<String>();

    System.out.println("Menu: ");
    System.out.println("1. Add Data ");
    System.out.println("2. Hapus Data ");
    System.out.println("3. Ubah Data ");
    System.out.println("4. Exit ");

    // int menu = System.console().readLine();


    //Instantiating an ArrayList object
    list.add("ade");
    list.add("ani");
    list.add("bani");
    list.add("deni");
    System.out.println("Contents of the Array List: \n"+list);

    Scanner in = new Scanner(System.in);
    System.out.println("Pilih Menu: ");
    int menu = in.nextInt();
    System.out.println("Kamu memilih menu: "+ menu);
    // System.out.println("Contents of the Array List: \n"+list);
    //Sorting the array list
    Collections.sort(list);
    // System.out.println("Minimum value: "+list.get(0));
    // System.out.println("Maximum value: "+list.get(list.size()-1));
    switch (menu) {
        case 1:
            System.out.println("Kamu memasuki menu Tambah Data");
            Scanner inadd = new Scanner(System.in);
            System.out.println("Input Data: ");
            String addData = inadd.nextLine();
            list.add(addData);
            System.out.println("Contents of the Array List: \n"+list);
            break;
        case 2:
            System.out.println("Kamu memasuki menu Tambah Data");
            Scanner indel = new Scanner(System.in);
            System.out.println("Input Data Yang Akan Di Hapus: ");
            String delData = indel.nextLine();
            list.remove(delData);
            System.out.println("Contents of the Array List: \n"+list);
            break;
        case 3:
            System.out.println("Kamu memasuki menu Tambah Data");
            Scanner inex = new Scanner(System.in);
            System.out.println("Input Data Yang Akan Di Ganti: ");
            String exData = inex.nextLine();
            System.out.println("Input Data Pengganti: ");
            String extData = inex.nextLine();
            System.out.println(exData  +  " Dihapus dan diganti dengan " + extData);
            list.remove(exData);
            list.add(extData);
            // list[exData] = extData;
            
            System.out.println("Contents of the Array List: \n"+list);
            break;
        case 4:
          System.out.println("exited");
          break;
      }

}
}
