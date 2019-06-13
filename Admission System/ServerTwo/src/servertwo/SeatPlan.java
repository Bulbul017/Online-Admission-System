
package servertwo;

/**
 *
 * @author ac
 */


public class SeatPlan {
    
    private int RoomNum;
    private String seat;
    private int floor;
    private int registrationNumber;
    private String Hall;
    private int Room;
    
    public SeatPlan(int registrationNumber){
        
        this.registrationNumber = registrationNumber;
        
    }
    
    public String allocateSeat(){
        
        int reg = (this.registrationNumber)%20190000;
        if(reg>=0 && reg<=500)
	{
		this.Hall="Curzon";
		if(reg<=50)
		{
			floor=0;
			Room=101;
		}
		if(reg>=51 &&reg<=100)
		{
			floor=0;
			Room=102;
		}
		if(reg>=101 && reg<=150)
		{
			floor=0;
			Room=103;

		}
		if(reg>=151 &&reg<=200)
		{
			floor=0;
			Room=104;
		}
		if(reg>=201 && reg<=250)
		{
			floor=0;
			Room=105;

		}

		if(reg>=251 && reg<=300)
		{
			floor=1;
			Room=201;
		}
		if(reg>=301 &&reg<=350)
		{
			floor=1;
			Room=202;
		}
		if(reg>=351 && reg<=400)
		{
			floor=1;
			Room=203;

		}
		if(reg>=401 &&reg<=450)
		{
			floor=1;
			Room=204;
		}
		if(reg>=451 && reg<=500)
		{
			floor=1;
			Room=205;

		}

	}

	if(reg>=501 && reg<=1000)
	{
		this.Hall="Arts Building";
		if(reg<=501 && reg>=550)
		{
			floor=0;
			Room=101;
		}
		if(reg>=551 &&reg<=600)
		{
			floor=0;
			Room=102;
		}
		if(reg>=601 && reg<=650)
		{
			floor=0;
			Room=103;

		}
		if(reg>=651 &&reg<=700)
		{
			floor=0;
			Room=104;
		}
		if(reg>=701 && reg<=750)
		{
			floor=0;
			Room=105;

		}

		if(reg>=751 && reg<=800)
		{
			floor=1;
			Room=201;
		}
		if(reg>=801 &&reg<=850)
		{
			floor=1;
			Room=202;
		}
		if(reg>=851 && reg<=900)
		{
			floor=1;
			Room=203;

		}
		if(reg>=901 &&reg<=950)
		{
			floor=1;
			Room=204;
		}
		if(reg>=951 && reg<=1000)
		{
			floor=1;
			Room=205;

		}

	}

	if(reg>=501 && reg<=1000)
        {
                this.Hall="Faculty of Business Studies";
		if(reg<=1001 && reg>=1050)
		{
			floor=0;
			Room=101;
		}
		if(reg>=1051 &&reg<=1100)
		{
			floor=0;
			Room=102;
		}
		if(reg>=1101 && reg<=1150)
		{
			floor=0;
			Room=103;

		}
		if(reg>=1151 &&reg<=1200)
		{
			floor=0;
			Room=104;
		}
		if(reg>=1201 && reg<=1250)
		{
			floor=0;
			Room=105;

		}

		if(reg>=1251 && reg<=1300)
		{
			floor=1;
			Room=201;
		}
		if(reg>=1301 &&reg<=1350)
		{
			floor=1;
			Room=202;
		}
		if(reg>=1351 && reg<=1400)
		{
			floor=1;
			Room=203;

		}
		if(reg>=1401 &&reg<=1450)
		{
			floor=1;
			Room=204;
		}
		if(reg>=1451 && reg<=1500)
		{
			floor=1;
			Room=205;

		}

	}
        String seatFloor = Integer.toString(this.floor);
        String seatRoom = Integer.toString(this.Room);
        
        this.seat = "Building: "+this.Hall +" Floor: "+ seatFloor +" Room: "+ seatRoom;
        
        return this.seat;
        
    }



}
   
