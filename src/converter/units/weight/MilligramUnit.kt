package converter.units.weight

class MilligramUnit(override val weight: Double) : WeightUnit() {
    override val type: WeightUnitType
        get() = WeightUnitType.MILLIGRAM
    override val abbreviated: String
        get() = "mg"
    override val oneUnit: String
        get() = "milligram"
    override val manyUnits: String
        get() = "milligrams"
    override val toGrams: Double
        get() = weight.times(0.001)

}