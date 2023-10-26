package Listas.Listainteira.LDEinteira;



public class LDEInteira {
    private node primeiro;
    private node ultimo;
    private int qtd;
   
    public boolean isEmpty() { // teste forte!
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void inserirInicio(Integer valor) {
        node novo = new node(valor);    
        node retorno = this.buscar(valor);

        if (retorno != null) {

            System.out.println("Valor já existe na lista.");

        } else {
            
            if (this.isEmpty() == true) {

            this.primeiro = novo;this.ultimo = novo;this.qtd++;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
        }
        System.out.println("Inserção efetuada!");
    }

    }

      public void inserirFinal(Integer adiciona) {
        node novo = new node(adiciona);
        node atual = this.primeiro;

        if (isEmpty()) {
        this.primeiro = novo;
        this.qtd++;
        }
        else {
            while(atual != null){

                if(adiciona == atual.getInfo()){
                
                    System.out.println("Valor repetido não é possivel adicionar");
                    return;
                }else{
                    if(atual.getProx()== null){
                        atual.setProx(novo);
                        return;
                    }
                }
                atual = atual.getProx();
            }
        }
    }


     public node buscar(Integer valor){

        node atual = this.primeiro;
        Integer buscado = valor;

        if (isEmpty()) {
            System.out.println("Lista Vazia!");
            return null;
        }
        else{
            do{
                if (buscado.equals(atual.getInfo())) {
                    System.out.println("Valor encontrado");
                    return atual;
                }
                atual = atual.getProx();

            }while (atual.getProx()!=null);

            System.out.println("Valor não encontrado");
            return null;
        }
    }

    public void removerFinal(){
        if(isEmpty()){
            return;
        }
            if(qtd == 1){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
            }else{
                node novoUltimo = this.ultimo.getAnterior();
                novoUltimo.setProx(null);
                this.ultimo = novoUltimo;
                qtd--;
            }
    }

     public void removerInicio(){
        if(isEmpty()){
            return;
        }

          if(qtd == 1){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
            }else{
                node novoPrimeiro = this.primeiro.getProx();
                novoPrimeiro.setAnterior(null);
                this.primeiro = novoPrimeiro;
                qtd--;
            }
    }

    public void removerEspecifico(Integer remover){
        if (isEmpty()) {
            return;
        }
        if (buscar(remover) == null) {
            System.out.println("Valor não encontrado");

        }else{
            node atual = this.primeiro;
            node auxAnt;
            node auxProx;
            for (int i = 0; i <this.qtd; i++) {
               
                if (atual.getInfo() == remover) {
                    if (atual  == this.ultimo) {
                        removerFinal();
                         System.out.println("Valor removido");
                        return;
                    }
                    auxAnt = atual.getAnterior();
                    auxProx = atual.getProx();
                    auxAnt.setProx(auxProx);
                    auxProx.setAnterior(auxAnt);
                    qtd--;
                    System.out.println("Valor removido");
                    return;
                }
                atual = atual.getProx();
            }
        }
    }

    public void exibir(){
        if (isEmpty()) {
            System.out.println("Lista Vazia");
        }else {
            node atual = this.primeiro;
            do{
                System.out.print(atual.getInfo()+ " ");
                atual = atual.getProx();
            }while (atual != null);
            System.out.println(" ");
        }
    }

    public int removerCopias(int valor ){
        int cont = 0;
        node atual = this.primeiro;
        while (atual != null) {
            if (atual.getInfo() == valor) {
                removerEspecifico(atual.getInfo());
                cont++;
                this.qtd--;
            }
            atual = atual.getProx();
        }
        return cont;
    }

    public LDEInteira intersecao(LDEInteira outra) {
        LDEInteira retorno = new LDEInteira(); 
        
        node atual = this.primeiro;
        
        while (atual != null) {
            int valueA = atual.getInfo();
            if (outra.buscar(valueA)!=null) {
                retorno.inserirFinal(valueA); 
            }
            atual = atual.getProx();
        }
        
        return retorno;
    }
    
    public LDEInteira uniao(LDEInteira otherList) {
        LDEInteira retorno = new LDEInteira(); 
    
        node atual1 = this.primeiro;
        node atual2 = otherList.primeiro;
    
        
        while (atual1 != null) {
            int valueA = atual1.getInfo();
            retorno.inserirFinal(valueA);
            atual1 = atual1.getProx();
        }
    
        
        while (atual2 != null) {
            int valueB = atual2.getInfo();
            retorno.inserirFinal(valueB);
            atual2 = atual2.getProx();
        }
    
        return retorno;
    }
    
    public LDEInteira diferenca(LDEInteira outra) {
        LDEInteira diferenca = new LDEInteira(); // Cria uma nova lista para a diferença
    
        node currentA = this.primeiro;
    
        while (currentA != null) {
            int valueA = currentA.getInfo();
            if (outra.buscar(valueA) == null) {
                diferenca.inserirFinal(valueA); // Adiciona o valor à lista de diferença se não estiver presente em B
            }
            currentA = currentA.getProx();
        }
    
        return diferenca;
    }
    
}

