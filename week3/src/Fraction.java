public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction() {
        return topN+"/"+btmN;
    }
    
    public String toFloat() {
        float tN = topN;
        float bN = btmN;
        float ans = tN/bN;
        return ""+ans;
    }
    
    public void addFraction(Fraction f) {
        if (btmN == f.btmN){
            topN += f.topN;
        }
        else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN *= f.btmN;
        }
    }
}
