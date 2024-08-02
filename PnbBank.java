public class PnbBank {
    
  
        private int actNo;
        private String name;
        private Double balance;
        public int getActNo() {
            return actNo;
        }
        public void setActNo(int actNo) {
            this.actNo = actNo;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Double getBalance() {
            return balance;
        }
        public void setBalance(Double balance) {
            this.balance = balance;
        }
        
        
    
        public String toString() {
            return "PnbBank [actNo=" + actNo + ", name=" + name + ", balance=" + balance + "]";
        }
        
}
