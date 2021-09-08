package converter.units.length

class YardUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.YARD
    override val abbreviated: String
        get() = "yd"
    override val oneUnit: String
        get() = "yard"
    override val manyUnits: String
        get() = "yards"
    override val toMeters: Double
        get() = length.times(0.9144)
}