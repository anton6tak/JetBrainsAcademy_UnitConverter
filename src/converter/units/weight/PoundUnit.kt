package converter.units.weight

class PoundUnit(override val weight: Double) : WeightUnit() {
    override val type: WeightUnitType
        get() = WeightUnitType.POUND
    override val abbreviated: String
        get() = "lb"
    override val oneUnit: String
        get() = "pound"
    override val manyUnits: String
        get() = "pounds"
    override val toGrams: Double
        get() = weight.times(453.592)
}