package converter.units.weight

class KilogramUnit(override val weight: Double) : WeightUnit() {
    override val type: WeightUnitType
        get() = WeightUnitType.KILOGRAM
    override val abbreviated: String
        get() = "kg"
    override val oneUnit: String
        get() = "kilogram"
    override val manyUnits: String
        get() = "kilograms"
    override val toGrams: Double
        get() = weight.times(1000)
}