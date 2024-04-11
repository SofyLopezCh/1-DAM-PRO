package misClases.teoria;

class CGrados {
	private float gradosC;

	public void CentigradosAsignar(float gC) {
		gradosC = gC;

	}

	float FarenheitObtener() {
		return 9F / 5F * gradosC + 32F;
	}

	float CentrigradosObtener() {
		return gradosC;

	}

}
