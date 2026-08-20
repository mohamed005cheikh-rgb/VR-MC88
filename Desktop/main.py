import sys
import bluetooth
from PyQt5.QtWidgets import QApplication, QWidget, QVBoxLayout, QLabel, QPushButton

class VRMC88Desktop(QWidget):
    def __init__(self):
        super().__init__()
        self.initUI()

    def initUI(self):
        self.setWindowTitle('VR.MC88 - Desktop Receiver')
        self.setGeometry(100, 100, 400, 300)
        
        layout = QVBoxLayout()
        self.label = QLabel('VR.MC88 Server Status: Ready to Connect', self)
        layout.addWidget(self.label)
        
        self.btn = QPushButton('Start Bluetooth Listener', self)
        self.btn.clicked.connect(self.start_server)
        layout.addWidget(self.btn)
        
        self.setLayout(layout)

    def start_server(self):
        self.label.setText("Listening for Bluetooth Connection...")

if __name__ == '__main__':
    app = QApplication(sys.argv)
    ex = VRMC88Desktop()
    ex.show()
    sys.exit(app.exec_())
