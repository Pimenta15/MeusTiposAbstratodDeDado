package Listas.Listainteira;

public class LSEint {
    private LSEnode primeiro;


    public void inserirNoInicio(Integer num){
        LSEnode novo;
        novo = new LSEnode(num);
       
        if (this.primeiro == null) {
            this.primeiro = novo;
        }
        else{
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }
}
