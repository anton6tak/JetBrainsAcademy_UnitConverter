package converter.units.length

class FootUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.FOOT
    override val abbreviated: String
        get() = "ft"
    override val oneUnit: String
        get() = "foot"
    override val manyUnits: String
        get() = "feet"
    override val toMeters: Double
        get() = length.times(0.3048)
}