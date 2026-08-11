class ArtMaterialRunner {

    public static void main(String[] args) {

        ArtMaterial material1 = new ArtMaterial(
            "Water Color", "Camlin", "Paint",
            "Multicolor", 250, 24, "Pigment",
            "Medium", "Painting", false
        );

        ArtMaterial material2 = new ArtMaterial(
            "Acrylic Paint", "Brustro", "Paint",
            "Multicolor", 500, 12, "Acrylic",
            "Large", "Canvas Art", true
        );

        ArtMaterial material3 = new ArtMaterial(
            "Sketch Pen", "Faber-Castell", "Pen",
            "Multicolor", 180, 20, "Plastic",
            "Small", "Sketching", false
        );

        material1.displayInfo();
        material2.displayInfo();
        material3.displayInfo();
    }
}