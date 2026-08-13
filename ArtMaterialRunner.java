class ArtMaterialRunner {

    public static void main(String[] args) {

        ArtMaterial material1 = new ArtMaterial();

        ArtMaterial material2 = new ArtMaterial(
                "Water Color"
        );

        ArtMaterial material3 = new ArtMaterial(
                "Water Color", "Camlin"
        );

        ArtMaterial material4 = new ArtMaterial(
                "Water Color", "Camlin", "Paint"
        );

        ArtMaterial material5 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue"
        );

        ArtMaterial material6 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120
        );

        ArtMaterial material7 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12
        );

        ArtMaterial material8 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12,
                "Water Based"
        );

        ArtMaterial material9 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12,
                "Water Based", "Small"
        );

        ArtMaterial material10 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12,
                "Water Based", "Small", "Painting"
        );

        ArtMaterial material11 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12,
                "Water Based", "Small", "Painting", true
        );

        ArtMaterial material12 = new ArtMaterial(
                "Water Color", "Camlin", "Paint",
                "Blue", 120, 12,
                "Water Based", "Small", "Painting", true, 10
        );


        material1.displayInfo();
        material2.displayInfo();
        material3.displayInfo();
        material4.displayInfo();
        material5.displayInfo();
        material6.displayInfo();
        material7.displayInfo();
        material8.displayInfo();
        material9.displayInfo();
        material10.displayInfo();
        material11.displayInfo();
        material12.displayInfo();

    }
}