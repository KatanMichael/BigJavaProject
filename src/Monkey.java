public class Monkey extends  Animal
{

public Monkey(int age, String name, String gender)
{
    super(age,name,gender);
}

    @Override
    public void run()
    {
        while(this.isAlive())
        {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            this.set_age(this.get_age()+1);
            if(get_age() == 15)
            {
                this.setAlive(false);
            }

            if((get_age() % 5 ) == 0)
            {
                System.out.println(get_name() + " The Monkey"
                        +" is " +get_age()
                +" Years Old");
            }
        }

    }


    public String toString()
    {
        String s;
        if(this.get_gender().equals("Male"))
        {
            s = (get_name() + " Is a Male Monkey, And He is "+get_age()
            +" Years Old");
        }else
        {
            s = (get_name() + "Is a Female Monkey, And She is "+get_age()
                    +" Years Old");
        }

        return s;
    }
}
