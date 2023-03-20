 public class ProductionMonitoringSystem {
        private static ProductionMonitoringSystem instance = null;

        private ProductionMonitoringSystem() {
        }

        public static ProductionMonitoringSystem getInstance() {
            if (instance == null) {
                instance = new ProductionMonitoringSystem();
            }
            return instance;
        }

        public void addData(Car car) {
        }

        public void modifyData(Car car) {
        }
    }


//O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa asigure
// adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului central, intr-un mediu securizat (sistemul
//va exista sub forma unui server dispus in datacenter-ul din HQ). Programatorii trebuie sa se asigure ca sistemul nu va
//putea fi replicat si ca toate datele vor fi manageriate prin intermediul singurului server mentionat anterior.
