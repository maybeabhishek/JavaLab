import java.util.*;

class Advert {
    protected int fee;

    public Advert() {
        fee = 0;
    }

    public Advert(int fee) {
        this.fee = fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int cost() {
        return fee;
    }

    public String toString() {
        return "\nAdvert: Fee=" + fee;
    }
}

class Hoarding extends Advert {
    private int rate;
    private int numDays;

    public Hoarding(int fee, int rate, int numDays) {
        super(fee);
        this.rate = rate;
        this.numDays = numDays;
    }

    public int cost() {
        return super.cost() + rate * numDays;
    }

    public String toString() {
        return "\n\n" + super.toString() + "\nHoarding:\n" + "Days: " + numDays + "\nRate: " + rate;
    }
}

class Newspaper extends Advert {
    private int numColumns;
    private int rate;

    public Newspaper(int fee, int numColumns, int rate) {
        super(fee);
        this.numColumns = numColumns;
        this.rate = rate;
    }

    public int cost() {
        return super.cost() + rate * numColumns;
    }

    public String toString() {
        return "\n\n" + super.toString() + "\nNewspaper:\n" + "Number of Columns: " + numColumns + "\nRate: " + rate;
    }
}

class TVAd extends Advert {

    private int sec;
    private int rate;
    private boolean peak;

    public TVAd(int fee, int rate, int length, boolean peakTime) {
        super(fee);
        this.rate = rate;
        this.sec = length;
        this.peak = peakTime;
    }

    public int cost() {
        return super.cost() + sec * (peak ? rate * 2 : rate);
    }

    public String toString() {
        return super.toString() + " TV ad: length= " + sec + " secs." + " Rate=" + (peak ? rate * 2 : rate);
    }
}

class Campaign {
    private ArrayList campaign;

    Campaign() {
        campaign = new ArrayList();
    }

    public void addAdvert(Advert a) {
        campaign.add(a);
    }

    public int getCost() {
        int total = 0;
        Iterator it = campaign.iterator();
        while (it.hasNext()) {
            Advert ad = (Advert) it.next();
            total = total + ad.cost();
        }
        return total;
    }

    public String toString() {
        return "Advert Campaign" + campaign + "\n\nTotal Cost = " + getCost();
    }
}

class AdTest{
    public static void main(String[] args){
        Campaign c = new Campaign();
        c.addAdvert(new Advert(1000));
        c.addAdvert(new Hoarding(500, 200, 30));
        c.addAdvert(new Newspaper(0, 30, 20));
        c.addAdvert(new TVAd(50000, 1000, 30, true));
        System.out.println(c);
    }
}