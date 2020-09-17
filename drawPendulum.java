import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;


public class drawPendulum extends Pane{

	private Timeline animation;
	private double deta = -0.05;
	private double angle = Math.PI / 3;
	private int x ;
	private int y ;
	private int endx,endy;
	private int length = 100;
	private Line line ;
	private Circle circle2;
	
	
	public drawPendulum() {
		x = 150;
		y = 20;
		Circle circle1 = new Circle(x,y,5);
		circle1.setFill(Color.SILVER);
		getChildren().add(circle1);
		circle2 = new Circle(endx,endy,5);
		circle2.setFill(Color.BLACK);		
		getChildren().add(circle2);
		line =new Line(x,y,endx,endy);
		getChildren().add(line);
		animation = new Timeline(
				new KeyFrame(Duration.millis(50), e-> swing()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();

	}
		
		public void swing() {
		// TODO Auto-generated method stub
			this.endx = this.x +  (int) (Math.sin(angle) * length);
		    this.endy = this.y + (int) (Math.cos(angle) * length);
		    double angleMin = Math.PI /3;		    
			double angleMax= -Math.PI/3;
			
			if(angle > angleMax ) {
				deta *=-1;
				
			}
			if(angle < angleMin) {
				deta *=-1;
			}

			angle -=deta;
			circle2.setCenterX(endx);
			circle2.setCenterY(endy);
			line.setEndX(endx);
			line.setEndY(endy);
			
	}

		public void pause() {
			
			animation.pause();
		}
		
		public void play() {
			animation.play();
	   
		}
		

		public void decreaseSpeed() {
			if(deta> -0.01&& deta < 0) {
				deta = -0.01;
			}else if(deta <0.01 && deta >0) {
				deta = 0.01;
			}
			else {deta /= 1.5;}
		}

		public void increaseSpeed() {
			if(deta< 0.25 && deta >-0.25) {
				deta *= 1.5;
			}else if(deta > 0 ) {
				deta = 0.25;
			}else {
				deta = -0.25;
			}
		// TODO Auto-generated method stub
		
		}
		
		/**
		 * @return the detaT
		 */
		public double getDetaT() {
			return deta;
		}


		/**
		 * @param detaT the detaT to set
		 */
		public void setDetaT(double deta) {
			this.deta = deta;
		}


		/**
		 * @return the angle
		 */
		public double getAngle() {
			return angle;
		}


		/**
		 * @param angle the angle to set
		 */
		public void setAngle(double angle) {
			this.angle = angle;
		}


		/**
		 * @return the x
		 */
		public double getX() {
			return x;
		}


		/**
		 * @param x the x to set
		 */
		public void setX(int x) {
			this.x = x;
		}


		/**
		 * @return the y
		 */
		public double getY() {
			return y;
		}


		/**
		 * @param y the y to set
		 */
		public void setY(int y) {
			this.y = y;
		}


		/**
		 * @return the length
		 */
		public double getLength() {
			return length;
		}


		/**
		 * @param length the length to set
		 */
		public void setLength(int length) {
			this.length = length;
		}






}
