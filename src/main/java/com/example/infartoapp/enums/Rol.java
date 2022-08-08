package com.example.infartoapp.enums;

    public enum Rol {
        CENTRO_MEDICO("Centro médico"),
        AMBULANCIA("Ambulancia"),
        UNIDAD_CORONARIA("Unidad coronaria"),
        HEMODINAMISTA("Hemodinamista"),
        ADMIN("Admin");

        private final String rol_name;


        Rol(String rol_name) {
            this.rol_name = rol_name;
        }

        public String getRol_name() {
            return rol_name;
        }
    }

