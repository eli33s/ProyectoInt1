import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoargComponent } from './logoarg.component';

describe('LogoargComponent', () => {
  let component: LogoargComponent;
  let fixture: ComponentFixture<LogoargComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoargComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoargComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
