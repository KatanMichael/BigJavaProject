public abstract class Animal implements Runnable
{
    private String _gender;
    private int _age;
    private int _id;
    private String _name;
    private boolean _isHungry;
    private boolean isAlive;

    public Animal(int _age, String _name, String _gender)
    {
        isAlive = true;
        int idTemp;
       if(_age < 0)
       {
           this._age = 0;
       }else
       {
           this._age = _age;
       }

        this._name = _name;

       idTemp = (int) (Math.random()*100000);
        this._id = idTemp;

        if((!_gender.equals("Male")) && (!_gender.equals("Female")))
        {
            int temp = (int) ((Math.random()*1000)%2);

            if (temp == 0)
            {
                this._gender = "Male";
            }else
            {
                this._gender = "Female";
            }
        }

    }

    public int get_age()
    {
        return _age;
    }

    public  void set_age(int _age)
    {
        if(_age > 0)
        {
            this._age = _age;
        }
    }

    public int get_id()
    {
        return _id;
    }

    public void set_id(int _id)
    {
        if(_id > 0)
        {
            this._id = _id;
        }
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name)
    {
        this._name = _name;
    }

    public boolean is_isHungry()
    {
        return _isHungry;
    }

    public void set_isHungry(boolean _isHungry)
    {
        this._isHungry = _isHungry;
    }

    public String get_gender() {
        return _gender;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
