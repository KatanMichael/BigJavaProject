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
                Thread.sleep(5000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            this.set_age(this.get_age()+1);
            if(get_age() == 30)
            {
                set_isHungry(false);
            }

            if((get_age() % 5 ) == 0)
            {
                System.out.println(get_name() + " The Monkey"
                        +" is " +get_age()
                +" Years Old");
            }
        }

    }
}
