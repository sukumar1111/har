/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus.management;

/**
 *
 * @author 16903
 */
class User {
    private int id;
    private String bus_no,movement,bus_source,bus_dest,depart_date,depart_time,price,total_seat;
    
    public User(int id,String bus_no,String movement,String bus_source,String bus_dest,String depart_date,String depart_time,String price,String total_seat){
        this.id=id;
        this.bus_no=bus_no;
        this.movement=movement;
        this.bus_source=bus_source;
        this.bus_dest=bus_dest;
        this.depart_date=depart_date;
        this.depart_time=depart_time;
        this.price=price;
        this.total_seat=total_seat;
    }
    public int getid(){
        return id;
        }
    public String getbus_no(){
        return bus_no;
    }
    public String getmovement(){
        return movement;
    }
    public String getbus_source(){
        return bus_source;
    }
    public String getbus_dest(){
        return bus_dest;
    }
    public String getdepart_date(){
        return depart_date;
    }
    public String getdepart_time(){
        return depart_time;
    }
     public String getprice(){
        return price;
    }
      public String gettotal_seat(){
        return total_seat;
    }
    
}
