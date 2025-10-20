package br.com.hospital.model;

public class Estoque {
        private int IdEstoque;
        private String DataValidade;
        private int Quantidade;
        private String DataEntrada;

        public Estoque() {}

        public Estoque(int IdEstoque, String DataValidade, int Quantidade, String DataEntrada){
              this.IdEstoque = IdEstoque;
              this.DataValidade = DataValidade;
              this.Quantidade = Quantidade;
              this.DataEntrada = DataEntrada;
        }

        // Getters e Setters

        public int getIdEstoque(){ return IdEstoque;}
        public void setIdEstoque(int IdEstoque) { this.IdEstoque = IdEstoque;}

        public String getDataValidade() { return DataValidade;}
        public void setDataValidade(String DataValidade) {this.DataValidade = DataValidade}

        public Int getQuantidade() {return Quantidade;}
        public void setQuantidade(Int Quantidade) {this.Quantidade = Quantidade}

        public String getDataEntrada() {return DataEntrada;}
        public void setDataEntrada(String DataEntrada) {this.DataEntrada = DataEntrada}

        @Override
        public String toString() {
            return "Estoque [id="+ IdEstoque+", Data de entrada"+DataEntrada+", Quantidade "+Quantidade+", Data Validade"+DataValidade+"]";
        }  
}
