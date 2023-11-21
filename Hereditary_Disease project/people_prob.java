import java.util.HashMap;

public class people_prob {
    HashMap<Integer, Double> gene = new HashMap<>();
    HashMap<Boolean, Double> trait = new HashMap<>();

    public void set_gene(int gene_number, double probability){
        this.gene.put(gene_number, probability);
    }

    public void set_trait(Boolean have_trait, double probability){
        this.trait.put(have_trait, probability);
    }

}
