class user{
    private Integer id;
    private String username;
    private String password;


    public user(Integer id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }

    public user(){

    }

    public Integer getid(){
        return id;
    }

    public void setid(Integer id){
        this.id=id;
    }

    public String getusername(){
        return username;
    }

    public void setusername(String username){
        this.username=username;
    }

    public String getpassword(){
        return password;
    }

    public void setpassword(String password){
        this.password=password;
    }
}



class UserBO{
    public void getuser(){
        user[] user = new user[5];

    }
}




class main{

    public static void main(String[] args) {
        
    }
}