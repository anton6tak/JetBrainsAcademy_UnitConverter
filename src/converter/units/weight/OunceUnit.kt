package converter.units.weight

class OunceUnit(override val weight: Double) : WeightUnit() {
    override val type: WeightUnitType
        get() = WeightUnitType.OUNCE
    override val abbreviated: String
        get() = "oz"
    override val oneUnit: String
        get() = "ounce"
    override val manyUnits: String
        get() = "ounces"
    override val toGrams: Double
        get() = weight.times(28.3494925441)
}