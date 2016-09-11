package com.example.testbitmapscale;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {


	private View view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.test);
//		view = View.inflate(this, R.layout.test, null);
//		setContentView(view);

//		final MyCustomView myCustomView = (MyCustomView) view.findViewById(R.id.mycustomview);
//		myCustomView.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				MyCustomView.titleBackgroundColor=Color.BLUE;
//				myCustomView.invalidate();
//			}
//		});
		
	}

//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		if (event.getPointerCount() > 1) {
//			// 多点触控
//			// 返回给ScaleGestureDetector来处理
//			return mScaleGestureDetector.onTouchEvent(event);
//		} else {
//			// 单点触控
//			switch (event.getAction()) {
//			case MotionEvent.ACTION_DOWN:
//				downX = (int) event.getX();
//				downY = (int) event.getY();
//				newHeight = view.getLayoutParams().height;
//				newWidth = view.getLayoutParams().width;
////				 int widthMeasureSpec =
////				 View.MeasureSpec.makeMeasureSpec(2000,View.MeasureSpec.AT_MOST);
////				
////				 int heightMeasureSpec
////				 =View.MeasureSpec.makeMeasureSpec(2000,View.MeasureSpec.AT_MOST);
////				
////				 view.measure(widthMeasureSpec,heightMeasureSpec);
////				
////				 newHeight = view.getMeasuredHeight();
////				
////				 newWidth = view.getMeasuredWidth();
//				break;
//			case MotionEvent.ACTION_MOVE:
//				long currentTimeMillis = System.currentTimeMillis();
//				if (currentTimeMillis - lastMultiTouchTime > 200) {
//					// 双指触控后要等待200毫秒才能执行单指触控的操作，避免双指触控后出现颤抖的情况
//					int moveX = (int) event.getX();// 移动手指的时候手指的x
//					int moveY = (int) event.getY();// 移动手指的时候手指的y
//					int deltaX = (int) (moveX - downX);
//					int deltaY = (int) (moveY - downY);
//					int newLeft = left + deltaX;// view的新left
//					int newTop = top + deltaY;// view的新top
//					int newRight = right + deltaX;// view的新right
//					int newBottom = bottom + deltaY;// view的新bottom
////					int newWidth = (int) (preScale * originalWidth);
////					int newHeight = (int) (preScale * originalHeight);
////					if (deltaX>(newWidth-originalHeight)/2||deltaY>(newHeight-originalHeight)/2) {
////						return false;
////					}
//					// int newWidth = view.getWidth();
//					// int newHeight = view.getHeight();
//					System.out.println("newWidth:" + newWidth + "newHeight:"
//							+ newHeight);
////					System.out.println(preScale);
//					if (newLeft < originalWidth - newWidth) {
//						newLeft = originalWidth - newWidth;
//						newRight = newLeft + newWidth;
//					}
//					// if (newTop < originalHeight - newHeight){
//					// newTop = originalHeight - newHeight;
//					// newBottom= newTop+newHeight;
//					// }
//					// if(newRight>originalWidth){
//					// newRight=originalWidth;
//					// newLeft=newRight-newWidth;
//					// }
//					// if(newBottom>originalHeight){
//					// newBottom=originalHeight;
//					// newTop=newBottom-newHeight;
//					// }
//					view.layout(newLeft, newTop, newRight, newBottom);// 重新摆放view的位置
//				} else {
//					return false;
//				}
//
//				break;
//			case MotionEvent.ACTION_UP:
//				// 更新位置信息
//				left = view.getLeft();
//				top = view.getTop();
//				right = view.getRight();
//				bottom = view.getBottom();
//				break;
//
//			default:
//				break;
//			}
//			return true;// 代表消费了事件
//		}
//	}


}