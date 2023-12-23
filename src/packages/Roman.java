package packages;

class Roman extends Livre {
    private String maisonEdition;
    private int nbExemplaires;

    public Roman(String titre, String auteur, double prix, int nbPages, String maisonEdition, int nbExemplaires) {
        super(titre, auteur, prix, nbPages);
        this.maisonEdition = maisonEdition;
        this.nbExemplaires = nbExemplaires;
    }
   

    @Override
	public int compareTo(Livre autreLivre) {
		
		return super.compareTo(autreLivre);
	}

	
    
	@Override
    public String toString() {
        return super.toString() + ", maisonEdition=" + maisonEdition + ", nbExemplaires=" + nbExemplaires;
    }

    @Override
    public void afficher() {
        System.out.println("Type: Roman, " + toString());
    }

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

