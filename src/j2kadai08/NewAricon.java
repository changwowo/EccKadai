package j2kadai08;

public class NewAricon implements IAircon{

    int mode = 0;
    boolean power;

    public NewAricon(){}
    @Override
    public void showData() {
        if(!power) System.out.println("電源 : OFF");
        else{
            switch (mode){
                case 0 :System.out.println("電源 : ON、モード:冷房");break;
                case 1 :System.out.println("電源 : ON、モード:暖房");break;
                case 2 :System.out.println("電源 : ON、モード:送風");break;
            }
        }

        /*電源:ON、モード:冷房*/
    }

    @Override
    public void powerOnOff() {
        if(!power){
            System.out.println("電源を入れました!");
            power = true;
        }
        else{
            System.out.println("電源を切りました!");
            power = false;
        }

    }

    @Override
    public void toCool() {
        if(power){
            System.out.println("冷房に切り換えました!");
            mode = 0;
        }else{
            System.out.println("電源が入っていません!");
        }

    }

    @Override
    public void toHeat() {
        if(power){
            System.out.println("暖房に切り換えました!");
            mode = 1;
        }else{
            System.out.println("電源が入っていません!");
        }

    }

    @Override
    public void toBlow() {
        if(power){
            System.out.println("送風に切り換えました!");
            mode = 2;
        }else{
            System.out.println("電源が入っていません!");
        }

    }
}
