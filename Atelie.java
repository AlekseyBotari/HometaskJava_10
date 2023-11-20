public class Atelie implements Man, Woman {

    @Override
    public void dressTheMan(Cloth[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof Man){
                System.out.println( clothes[i].colour +", " + clothes[i].size.euroSize);
            }
        }
    }

    @Override
    public void dressTheMan() {

    }

    @Override
    public void dressTheWoman(Cloth[] cloth) {

    }

    @Override
    public void dressTheWoman() {

    }

    @Override
    public void DressWoman(Cloth[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof Woman){
                System.out.println(clothes[i] +", " + clothes[i].colour +", " + clothes[i].size.euroSize);
            }
        }
    }


}
