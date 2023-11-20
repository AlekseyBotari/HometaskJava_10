public enum Size {
    XXS (32){
        @Override
        public String getDescription() {
            return "Дитячий розмір";
        }
    },
    XS (34),
    S (36),
    M (38),
    L (40);
int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public  String  getDescription (){
        return  "Дорослий розмір";
    }
}
