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
    
    public void IOCRA(int valor) {// Crescente ordenado com repetidos antes
        node novo = new node(valor);
        if (this.isEmpty()) {// Se for vazio, insere no inicio;
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor <= this.primeiro.getInfo()) {// Insere inicio se o primeiro for maior que o novo
            this.primeiro.setAnterior(novo);
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor > this.ultimo.getInfo()) {// Insere no final se o novo for maior que o ultimo
            this.ultimo.setProx(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            qtd++;
            System.out.println("Valor inserido");

        } else if (valor == this.ultimo.getInfo()) {
            this.ultimo.getAnterior().setProx(novo);
            novo.setAnterior(this.ultimo.getAnterior());
            this.ultimo.setAnterior(novo);
            novo.setProx(this.ultimo);
            qtd++;
            System.out.println("Valor inserido");
        } else {
            node aux = this.primeiro.getProx();
            while (aux != null) {
                if (aux.getInfo() >= valor) {
                    novo.setAnterior(aux.getAnterior());
                    novo.setProx(aux);
                    aux.getAnterior().setProx(novo);
                    aux.setAnterior(novo);
                    aux = novo;
                    this.qtd++;
                    System.out.println("Valor inserido");
                    return;
                }
                aux = aux.getProx();
            }
        }
    }

    public void removerTodasCopias(int valorParaRemover) {
        node atual = this.primeiro;
    
        while (atual != null) {
            if (atual.getInfo() == valorParaRemover) {
                node anterior = atual.getAnterior();
                node proximo = atual.getProx();
    
                if (anterior != null) {
                    anterior.setProx(proximo);
                } else {
                    this.primeiro = proximo;
                }
    
                if (proximo != null) {
                    proximo.setAnterior(anterior);
                } else {
                    this.ultimo = anterior;
                }
    
                this.qtd--;
                atual = proximo; 
            } else {
                atual = atual.getProx();
            }
        }
    }

    public void IODS(int valor) {// Decrescente ordenado sem repetidos
        node novo = new node(valor);
        if (this.isEmpty()) {// Se for vazio, insere no inicio;
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor > this.primeiro.getInfo()) {
            this.primeiro.setAnterior(novo);
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
            System.out.println("Valor inserido");

        } else if (valor == this.primeiro.getInfo()) {
            System.out.println("Valor repetido");

        } else if (valor > this.ultimo.getInfo()) {// Insere no final se o novo for maior que o ultimo
            this.ultimo.setProx(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            qtd++;
            System.out.println("Valor inserido");

        } else if (valor == this.ultimo.getInfo()) {
            System.out.println("Valor não foi inserido");
        } else {
            node aux = this.primeiro.getProx();
            while (aux != null) {
                if (aux.getInfo() < valor) {
                    novo.setAnterior(aux.getAnterior());
                    novo.setProx(aux);
                    aux.getAnterior().setProx(novo);
                    aux.setAnterior(novo);
                    aux = novo;
                    this.qtd++;
                    System.out.println("Valor inserido");
                    return;

                } else if (aux.getInfo() == valor) {
                    System.out.println("Valor já foi inserido na lista");
                    return;

                }
                aux = aux.getProx();
            }
        }
    }
    public node buscaSequencialMelhorada(int valorProcurado) {
        node atual = this.primeiro;
    
        while (atual != null) {
            if (atual.getInfo() == valorProcurado) {
                return atual; // Retorna a referência para o nó encontrado
            } else if (atual.getInfo() < valorProcurado) {
                // Como a lista está ordenada em ordem decrescente, se chegarmos a um valor menor, podemos parar a busca
                return null;
            }
            atual = atual.getProx();
        }
    
        return null; // Valor não encontrado na lista
    }
    
    public void remover(int valorParaRemover) {
        node noParaRemover = buscaSequencialMelhorada(valorParaRemover);
    
        if (noParaRemover != null) {
            node anterior = noParaRemover.getAnterior();
            node proximo = noParaRemover.getProx();
    
            if (anterior != null) {
                anterior.setProx(proximo);
            } else {
                this.primeiro = proximo;
            }
    
            if (proximo != null) {
                proximo.setAnterior(anterior);
            } else {
                this.ultimo = anterior;
            }
    
            this.qtd--;
            System.out.println("Valor " + valorParaRemover + " removido da lista.");
        } else {
            System.out.println("Valor " + valorParaRemover + " não encontrado na lista.");
        }
    }
    
}

